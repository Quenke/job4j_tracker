package ru.job4j.oop;

public class Surgeon extends Doctor{
    public String patient;

    public Surgeon(String name, String surname, String education, int birthday, String speciality, String patient) {
        super(name, surname, education, birthday, speciality);
        this.patient = patient;
    }

    public static void main(String[] args) {
        Surgeon surgeon = new Surgeon();
    }
}
