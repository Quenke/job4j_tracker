package ru.job4j.oop;

public class Fix {
    private String desc;

    public Fix(String issue) {
        this.desc = issue;
    }

    public static void main(String[] args) {
        String issue = "Fix me";
        Fix item = new Fix(issue);
    }
}
