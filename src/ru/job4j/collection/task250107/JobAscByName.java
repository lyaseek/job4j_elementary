package ru.job4j.collection.task250107;

import java.util.Comparator;

public class JobAscByName implements Comparator<Job> {
    @Override
    public int compare(Job o1, Job o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
