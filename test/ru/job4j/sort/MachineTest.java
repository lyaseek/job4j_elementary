package ru.job4j.sort;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class MachineTest {
    @Test
    public void whenEquals() {
        assertThat(new Machine().change(35, 35), is(new int[]{}));
    }

    @Test
    public void when50By35() {
        assertThat(new Machine().change(50, 35), is(new int[]{10, 5}));
    }
}
