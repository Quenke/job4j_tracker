package ru.job4j.oop;

public class Engineer extends Profession {
    public Engineer(String name, String surname, String education, int birthday) {
        super(name, surname, education, birthday);
    }

    public static void main(String[] args) {
        Engineer engineer = new Engineer();
    }
}


