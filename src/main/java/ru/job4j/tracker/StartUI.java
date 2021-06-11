package ru.job4j.tracker;

import java.time.format.DateTimeFormatter;

public class StartUI {
    public static void main(String[] args) {
       Item example = new Item();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMMM-EEEE-yyyy HH:mm:ss");
        System.out.println(example.getCreated().format(formatter));
        Tracker tracker = new Tracker();
        tracker.add(new Item());
        tracker.findById(example.getId());
        System.out.println(tracker.findById(example.getId()));
    }
}
