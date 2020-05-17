package ru.job4j.collection.task34352;

import java.util.*;

public class Departments {
    public static List<String> fillGaps(List<String> deps) {
        HashSet<String> tmp = new HashSet<>();
        for (String value : deps) {
            String start = "";
            int i = 0;
            for (String el : value.split("/")) {
                if (i != 0) {
                    start = start + "/" + el;
                } else {
                    start = el;
                }
                tmp.add(start);
                i++;
            }
        }
        return new ArrayList<>(tmp);
    }

    public static void sortAsc(List<String> orgs) {
        Collections.sort(orgs);
    }

    public static void sortDesc(List<String> orgs) {
        orgs.sort(new DepartmentsSort());
    }
}
