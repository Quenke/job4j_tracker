package ru.job4j.oop;

public class Dentist extends Doctor{
    public Dentist(String name, String surname, String education, int birthday) {
        super(name, surname, education, birthday);
    }

    public static void main(String[] args) {
        Dentist dentist = new Dentist();
    }
}
