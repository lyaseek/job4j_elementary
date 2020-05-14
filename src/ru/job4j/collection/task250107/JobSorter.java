package ru.job4j.collection.task250107;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class JobSorter {
    public static void main(String[] args) {
        List<Job> jobs = Arrays.asList(
                new Job("Fix bug", 1),
                new Job("Fix bug", 4),
                new Job("A bug", 4),
                new Job("X task", 0)
        );
        jobs.sort(new JobDescByName().thenComparing(new JobDescByPriority()));
        System.out.println(jobs);
        jobs.sort(new JobAscByPriority().thenComparing(new JobAscByName()));
        System.out.println(jobs);
    }
}
