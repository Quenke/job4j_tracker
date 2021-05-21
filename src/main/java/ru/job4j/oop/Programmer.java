package ru.job4j.oop;

public class Programmer extends Engineer{
    public Programmer(String name, String surname, String education, int birthday) {
        super(name, surname, education, birthday);
    }

    public static void main(String[] args) {
        Programmer programmer = new Programmer();
    }
}
