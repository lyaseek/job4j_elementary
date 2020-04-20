package ru.job4j.ex;

import org.junit.Test;

import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.*;

public class FactTest {
    @Test(expected = IllegalArgumentException.class)
    public void whenNIsLessThan0() {
        new Fact().calc(-4);
    }
    @Test
    public void whenNIsGreaterThan0() {
        int rsl = new Fact().calc(6);
        assertThat(rsl, is(720));
    }

}
