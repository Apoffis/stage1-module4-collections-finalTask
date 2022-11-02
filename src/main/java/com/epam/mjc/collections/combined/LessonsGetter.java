package com.epam.mjc.collections.combined;

import java.util.*;

public class LessonsGetter {
    public Set<String> getLessons(Map<String, List<String>> timetable) {
        Set<String> lessons = new HashSet<>();

        for(Map.Entry<String, List<String>> point : timetable.entrySet()) {
            lessons.addAll(point.getValue());
        }
        return lessons;
    }
}
