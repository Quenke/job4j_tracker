package ru.job4j.oop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        int result = Max.max(1, 2);
        assertThat(result, is(2));
    }
    @Test
    public void whenMax3To2Then1() {
        int result = Max.max(3, 1,6);
        assertThat(result, is(6));
    }
    @Test
    public void whenMax15To2Then105() {
        int result = Max.max(15, 105,0);
        assertThat(result, is(105));
    }
    @Test
    public void whenMax455To2Then333() {
        int result = Max.max(455, 333);
        assertThat(result, is(455));
    }
}

