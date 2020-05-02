package ru.job4j.collection;

import java.util.ArrayList;
import java.util.List;

public class UsageArrayList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("Ivan");
        list.add("Petr");
        list.add("Stefan");
        for (String x : list) {
            System.out.println(x);
        }
    }
}
