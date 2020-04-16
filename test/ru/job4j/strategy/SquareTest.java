package ru.job4j.strategy;

import org.junit.Test;

import java.util.StringJoiner;

import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.*;

public class SquareTest {
    @Test
    public void whenDrawSquare() {
        assertThat(new Square().draw(), is(new StringJoiner(System.lineSeparator())
                .add("+ + + +")
                .add("+     +")
                .add("+ + + +")
                .toString()
        ));
    }
}
