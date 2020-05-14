package ru.job4j.collection.task250107;

import org.junit.Test;

import java.util.Comparator;

import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.lessThan;
import static org.hamcrest.Matchers.greaterThan;


public class JobTest {

    @Test
    public void whenDescComparatorByNameAndPriority() {
        Comparator<Job> cmpNamePriority = new JobDescByName().thenComparing(new JobDescByPriority());
        int rsl = cmpNamePriority.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenAscComparatorByNameAndPriority() {
        Comparator<Job> cmpNamePriority = new JobAscByName().thenComparing(new JobAscByPriority());
        int rsl = cmpNamePriority.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void whenAscByName() {
        assertThat(new JobAscByName().compare(new Job("R", 7), new Job("A", 1)), greaterThan(0));
    }

    @Test
    public void whenDscByName() {
        assertThat(new JobDescByName().compare(new Job("R", 7), new Job("A", 1)), lessThan(0));
    }

    @Test
    public void whenAscByPriority() {
        assertThat(new JobAscByPriority().compare(new Job("A", 3), new Job("A", 1)), greaterThan(0));
    }

    @Test
    public void whenDscByPriority() {
        assertThat(new JobDescByPriority().compare(new Job("A", 3), new Job("A", 1)), lessThan(0));
    }
}
