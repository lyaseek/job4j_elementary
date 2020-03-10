package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class CounterTest {

    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        int rsl = Counter.sumByEven(1, 10);
        int expected = 30;
        assertThat(rsl, is(expected));
    }

    @Test
    public void whenSumEvenNumbersFromTwoToEightThenTwenty() {
        int rsl = Counter.sumByEven(2, 8);
        int expected = 20;
        assertThat(rsl, is(expected));
    }

    @Test
    public void whenSumEvenNumbersFromTenToTwentyTwoThenTwenty() {
        int rsl = Counter.sumByEven(10, 22);
        int expected = 112;
        assertThat(rsl, is(expected));
    }
}