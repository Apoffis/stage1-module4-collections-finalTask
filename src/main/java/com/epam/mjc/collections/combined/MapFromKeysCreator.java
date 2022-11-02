package com.epam.mjc.collections.combined;

import java.util.*;

public class MapFromKeysCreator {

    public Map<Integer, Set<String>> createMap(Map<String, Integer> sourceMap) {
        Map<Integer, Set<String>> resMap = new HashMap<>();
        Set<String> set = new HashSet<>();

        for (Map.Entry<String, Integer> entry : sourceMap.entrySet())
            set.add(entry.getKey());

        for(Map.Entry<String, Integer> entry : sourceMap.entrySet()) {
            Set<String> setVal = new HashSet<>();
                for (String key : set) {
                    if(key.length() == entry.getKey().length()) {
                        setVal.add(key);
                        resMap.put(key.length(), setVal);
                    }
            }
        }

        return resMap;
    }
}
