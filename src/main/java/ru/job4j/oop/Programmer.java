package ru.job4j.oop;

public class Programmer extends Engineer{
   public String code;

    public Programmer(String name, String surname, String education, int birthday, String major, String code) {
        super(name, surname, education, birthday, major);
        this.code = code;
    }

    public Programmer() {

    }

    public static void main(String[] args) {
        Programmer programmer = new Programmer();
    }
}
