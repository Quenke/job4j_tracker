package ru.job4j.oop;

import javax.print.Doc;

public class Doctor extends Profession {

    public Doctor(String name, String surname, String education, int birthday) {
        super(name, surname, education, birthday);
    }


    public static void main(String[] args) {
        Doctor doctor = new Doctor("1");

    }
}
