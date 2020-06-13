package ru.job4j.stream;

import org.junit.Test;
import ru.job4j.stream.task249984.Student;
import ru.job4j.stream.task249988.StudentLevel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class StudentLevelTest {
    @Test
    public void whenSorted() {
        assertThat(StudentLevel.levelOf(Arrays.asList(
                new Student("Pety", 128),
                new Student("Masha", 28)
        ), 2).toString(), is(Arrays.asList(
                new Student("Masha", 28),
                new Student("Pety", 128)
        ).toString()));
    }

    @Test
    public void whenOnlyNull() {
        List<Student> input = new ArrayList<>();
        input.add(null);
        List<Student> expected = List.of();
        assertThat(StudentLevel.levelOf(input, 100), is(expected));
    }

    @Test
    public void whenHasNull() {
        List<Student> input = new ArrayList<>();
        input.add(null);
        input.add(new Student("Pety", 28));
        List<Student> expected = List.of(new Student("Pety", 28));
        assertThat(StudentLevel.levelOf(input, 10).toString(), is(expected.toString()));
    }
}
