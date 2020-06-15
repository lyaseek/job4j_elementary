package ru.job4j.stream.task249988;

import ru.job4j.stream.task249984.Student;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StudentLevel {
    public static List<Student> levelOf(List<Student> students, int bound) {
        return students.stream().flatMap(Stream::ofNullable).sorted(new SortByScoreDesc()).takeWhile(sc -> sc.getScore() > bound).collect(Collectors.toList());
    }
}
