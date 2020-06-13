package ru.job4j.stream;

import org.junit.Ignore;
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
                new Student("Ivanov", 200),
                new Student("Petrov", 20),
                new Student("Ivanov", 2000),
                new Student("Ivanov", 20),
                new Student("Kozlov", 30))).get("Ivanov"),
                is("Student{score=200, surname='Ivanov'}|Student{score=2000, surname='Ivanov'}|Student{score=20, surname='Ivanov'}"));
    }
}
