package ru.job4j.oop;

import javax.print.Doc;

public class Doctor {
    private String major;

    public Doctor(String major) {
        this.major = major;
    }

    public String getMajor() {
        return major;
    }

    public static void main(String[] args) {
        Doctor doctor = new Doctor("Dentist");
        Doctor doctor1 = new Doctor("Surgeon");
    }
}
