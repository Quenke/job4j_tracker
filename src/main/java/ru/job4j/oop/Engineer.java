package ru.job4j.oop;

public class Engineer {
    private String major;

    public Engineer(String major) {
        this.major = major;
    }

    public String getMajor() {
        return major;
    }

    public static void main(String[] args) {
        Engineer engineer = new Engineer("Programmer");
        Engineer engineer1 = new Engineer("Builder");
    }

}


