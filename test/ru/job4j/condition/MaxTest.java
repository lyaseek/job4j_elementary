package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        int result = Max.max(1, 2);
        assertThat(result, is(2));
    }

    @Test
    public void whenMax3To1Then2() {
        int result = Max.max(3, 1);
        assertThat(result, is(3));
    }

    @Test
    public void whenMax3To3Then3() {
        int result = Max.max(3, 3);
        assertThat(result, is(3));
    }

    @Test
    public void whenMax1To2To3() {
        int result = Max.max(1, 2, 3);
        assertThat(result, is(3));
    }

    @Test
    public void whenMax3To2To1() {
        int result = Max.max(3, 2, 1);
        assertThat(result, is(3));
    }

    @Test
    public void whenMax3To1To7To1() {
        int result = Max.max(3, 1, 7, 1);
        assertThat(result, is(7));
    }

    @Test
    public void whenMax3To8To7To1() {
        int result = Max.max(3, 8, 7, 1);
        assertThat(result, is(8));
    }

}