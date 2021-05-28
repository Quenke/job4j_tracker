package ru.job4j.oop;

import javax.print.Doc;

public class Doctor extends Profession {
    public String speciality;

    public Doctor(String name, String surname, String education, int birthday, String speciality) {
        super(name, surname, education, birthday);
        this.speciality = speciality;
    }

    public Doctor() {

    }

    public String getSpeciality() {
        return speciality;
    }

    public static void main(String[] args) {
        Doctor doctor = new Doctor();

    }
}
