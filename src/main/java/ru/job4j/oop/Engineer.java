package ru.job4j.oop;

public class Engineer extends Profession {
    public String major;

    public Engineer(String name, String surname, String education, int birthday, String major) {
        super(name, surname, education, birthday);
        this.major = major;
    }

    public Engineer(String name, String surname, String education, int birthday) {
        super(name, surname, education, birthday);
    }

    public Engineer() {
        super();
    }

    public String getMajor() {
        return major;
    }

    public static void main(String[] args) {
        Engineer engineer = new Engineer();
    }
}


