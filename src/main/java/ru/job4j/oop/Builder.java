package ru.job4j.oop;

public class Builder extends Engineer{
    public Builder(String name, String surname, String education, int birthday) {
        super(name, surname, education, birthday);
    }

    public static void main(String[] args) {
        Builder builder = new Builder();
    }
}
