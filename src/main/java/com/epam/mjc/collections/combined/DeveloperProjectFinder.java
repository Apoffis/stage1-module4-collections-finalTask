package com.epam.mjc.collections.combined;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class DeveloperProjectFinder {
    public List<String> findDeveloperProject(Map<String, Set<String>> projects, String developer) {
        List<String> devs = new ArrayList<>();
        for(Map.Entry<String, Set<String>> proj : projects.entrySet()) {
            if (proj.getValue().contains(developer)) devs.add(proj.getKey());
        }
        return devs;
    }
}
