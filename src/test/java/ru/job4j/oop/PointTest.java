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
        assertThat(rsl, closeTo(0, 0.001));
    }
    @Test
    public void distanceWhen1() {
        Point a = new Point(1, 1);
        Point b = new Point(1, 1);
        double rsl = a.distance(b);
        assertThat(rsl, closeTo(0, 0.001));
    }
}