package com.epam.mjc.collections.combined;

import java.util.*;

public class DeveloperProjectFinder {

    public List<String> findDeveloperProject(Map<String, Set<String>> projects, String developer) {
        List<String> devs = new ArrayList<>();
        for(Map.Entry<String, Set<String>> proj : projects.entrySet()) {
            if (proj.getValue().contains(developer)) devs.add(proj.getKey());
        }
        Collections.sort(devs, new LengthFirstComparator());
        Collections.reverse(devs);
        return devs;
    }

    public class LengthFirstComparator implements Comparator<String> {
        @Override
        public int compare(String o1, String o2) {
            if (o1.length()!=o2.length()) {
                return o1.length()-o2.length();
            }
            return o1.compareTo(o2);
        }
    }
}
