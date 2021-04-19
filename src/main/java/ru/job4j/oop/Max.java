package ru.job4j.oop;

public class Max {
    public static int max(int first, int second) {
        return first >= second ? first : second;
    }
    public static int max(int first, int second, int third, int fourth) {
        int tmp = max(third, fourth );
        return max(
                first,
                max(second, tmp));
    }
}

