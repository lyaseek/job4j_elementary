package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class TriangleTest {
    @Test
    public void areaWhenExist() {
        Point point1 = new Point(0, 0);
        Point point2 = new Point(0, 2);
        Point point3 = new Point(2, 0);
        Triangle triangle = new Triangle(point1, point2, point3);
        double result = 1.99;
        assertEquals(result, triangle.area(), 0.01);
    }

    @Test
    public void areaWhenNotExist() {
        Point point1 = new Point(1, 0);
        Point point2 = new Point(1, 0);
        Point point3 = new Point(3, 0);
        Triangle triangle = new Triangle(point1, point2, point3);
        double result = -1.0;
        assertEquals(result, triangle.area(), 0.01);

    }
}