package ru.job4j.stream.task249984;

import ru.job4j.stream.task249983.Address;
import ru.job4j.stream.task249983.Profile;
import ru.job4j.stream.task249983.SortByCity;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StudentsListToMap {
    public Map<String, String> collect(List<Student> students) {
        //return students.stream().distinct().collect(Collectors.toMap(Student::getSurname, Student::getScore));
        return students.stream().collect(Collectors.toMap(Student::getSurname, Student -> Student.getScore() + "", (key, value) -> key + "|" + value));
    }
}
