package ru.job4j.oop;

public class Builder extends Engineer{
    public String tool;

    public Builder(String name, String surname, String education, int birthday, String tool) {
        super(name, surname, education, birthday);
        this.tool = tool;
    }

    public static void main(String[] args) {
        Builder builder = new Builder();
    }
}
