package ru.job4j.oop.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Artem Shitov");
        student.setGroup("BI-6532");
        student.setCreated(new Date());

        System.out.println(student.getName());
        System.out.println(student.getGroup());
        System.out.println(student.getCreated());

    }
}
