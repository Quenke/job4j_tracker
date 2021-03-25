package ru.job4j.oop;

import junit.framework.TestCase;

import static org.hamcrest.Matchers.closeTo;
import static org.junit.Assert.assertThat;

public class PointTest extends TestCase {

    public void testDistanceWhen0() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 0);
        double rsl = a.distance(b);
        assertThat(rsl, closeTo(0, 0.00));

    }
    public void testDistanceWhen1() {
        Point a = new Point(1, 1);
        Point b = new Point(1, 1);
        double rsl = a.distance(b);
        assertThat(rsl, closeTo(0, 0.00));

    }
}