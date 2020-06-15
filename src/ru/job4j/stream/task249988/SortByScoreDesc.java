package ru.job4j.stream.task249988;

import ru.job4j.stream.task249984.Student;

import java.util.Comparator;

public class SortByScoreDesc implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return Integer.compare(o1.getScore(), o2.getScore());
    }
}
