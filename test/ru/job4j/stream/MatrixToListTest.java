package ru.job4j.stream;

import org.junit.Test;
import ru.job4j.stream.task249985.MatrixToList;

import java.util.Arrays;

import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class MatrixToListTest {
    @Test
    public void whenMatrix() {
        assertThat(new MatrixToList().collect(new Integer[][]{
                new Integer[]{1, 2, 3},
                new Integer[]{4, 5, 6},
                new Integer[]{8, 10, 9}}), is(Arrays.asList(1, 2, 3, 4, 5, 6, 8, 10, 9)));
    }
}
