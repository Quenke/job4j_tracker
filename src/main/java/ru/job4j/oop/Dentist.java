package ru.job4j.oop;

public class Dentist extends Doctor{
    public String workingHours;

    public Dentist(String name, String surname, String education, int birthday, String speciality, String workingHours) {
        super(name, surname, education, birthday, speciality);
        this.workingHours = workingHours;
    }

    public static void main(String[] args) {
        Dentist dentist = new Dentist();
    }
}
