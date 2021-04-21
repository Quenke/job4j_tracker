package ru.job4j.oop;

import org.junit.Test;

import static org.hamcrest.Matchers.closeTo;
import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void distanceWhen0() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 0);
        double rsl = a.distance(b);
        double expected = 0;
        assertEquals(expected, rsl ,0.01 );
    }
    @Test
    public void distanceWhen1() {
        Point a = new Point(1, 1);
        Point b = new Point(1, 1);
        double rsl = a.distance(b);
        double expected = 0;
        assertEquals(expected, rsl ,0.01 );
    }
    @Test
    public void distanceWhenSqrt8() {
        Point a = new Point(6, 7);
        Point b = new Point(4, 5);
        double rsl = a.distance(b);
        double expected = 2.828;
        assertEquals(expected, rsl ,0.01 );
    }
    @Test
    public void distanceWhenSqrt2() {
        Point a = new Point(3, 5);
        Point b = new Point(2, 4);
        double rsl = a.distance(b);
        double expected = 1.414;
        assertEquals(expected, rsl ,0.01 );
    }
    @Test
    public void distanceWhenSqrt16() {
        Point a = new Point(1, 8);
        Point b = new Point(1, 4);
        double rsl = a.distance(b);
        double expected = 4;
        assertEquals(expected, rsl ,0.01 );
    }

    @Test
    public void distanceWhenSqrt25ThreeD() {
        Point c = new Point(5, 0, 3);
        Point d = new Point(1, 0, 0);
        double rsl = c.distance3d(d);
        double expected = 5;
        assertEquals(expected, rsl ,0.01 );
    }
    @Test
    public void distanceWhenSqrt100ThreeD() {
        Point c = new Point(1, 12, 9);
        Point d = new Point(1, 4, 3);
        double rsl = c.distance3d(d);
        double expected = 10;
        assertEquals(expected, rsl ,0.01 );
    }
}