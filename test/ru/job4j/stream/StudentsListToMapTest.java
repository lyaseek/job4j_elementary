package ru.job4j.stream;

import org.junit.Test;
import ru.job4j.stream.task249984.Student;
import ru.job4j.stream.task249984.StudentsListToMap;

import java.util.Arrays;

import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.*;

public class StudentsListToMapTest {
    @Test
    public void whenHasDuplication() {
        assertThat(new StudentsListToMap().collect(Arrays.asList(
                new Student(200, "Ivanov"),
                new Student(20, "Petrov"),
                new Student(2000, "Ivanov"),
                new Student(20, "Ivanov"),
                new Student(30, "Kozlov"))).get("Ivanov"),
                is("Student{score=200, surname='Ivanov'}|Student{score=2000, surname='Ivanov'}|Student{score=20, surname='Ivanov'}"));
    }
}
