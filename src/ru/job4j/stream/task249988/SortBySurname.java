package ru.job4j.stream.task249988;

import ru.job4j.stream.task249984.Student;

import java.util.Comparator;

public class SortBySurname implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getSurname().compareTo(o2.getSurname());
    }
}
