package ru.job4j.stream.task249981;

import org.junit.Test;

import static org.hamcrest.core.Is.*;
import static org.junit.Assert.assertThat;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class SchoolTest {
    @Test
    public void whenAStudents() {
        Predicate<School.Student> predicateA = student -> (student.getScore() >= 70) & (student.getScore() <= 100);
        List<School.Student> students = Arrays.asList(new School.Student(90, "Petrov"), new School.Student(50, "Smirnov"), new School.Student(30, "Ivanov"));
        School school = new School();
        assertThat(school.collect(students, predicateA).get(0).getSurname(), is("Petrov"));
    }

    @Test
    public void whenCStudents() {
        Predicate<School.Student> predicateA = student -> (student.getScore() < 50) & (student.getScore() > 0);
        List<School.Student> students = Arrays.asList(new School.Student(90, "Petrov"), new School.Student(50, "Smirnov"), new School.Student(30, "Ivanov"));
        School school = new School();
        assertThat(school.collect(students, predicateA).get(0).getSurname(), is("Ivanov"));
    }

    @Test
    public void whenBStudents() {
        Predicate<School.Student> predicateA = student -> (student.getScore() < 70) & (student.getScore() >= 50);
        List<School.Student> students = Arrays.asList(new School.Student(90, "Petrov"), new School.Student(50, "Smirnov"), new School.Student(30, "Ivanov"));
        School school = new School();
        assertThat(school.collect(students, predicateA).get(0).getSurname(), is("Smirnov"));
    }
}
