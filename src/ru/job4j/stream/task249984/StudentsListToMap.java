package ru.job4j.stream.task249984;

import ru.job4j.stream.task249983.Address;
import ru.job4j.stream.task249983.Profile;
import ru.job4j.stream.task249983.SortByCity;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StudentsListToMap {
    public Map<String, Integer> collect(List<Student> students) {
        return students.stream().distinct().collect(Collectors.toMap(Student::getSurname, Student::getScore));
    }
}
