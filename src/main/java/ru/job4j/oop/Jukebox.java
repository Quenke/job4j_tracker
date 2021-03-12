package ru.job4j.oop;

public class Jukebox {
    public static void music(int position) {
        if (position == 1) {
            System.out.println("Пусть бегут неуклюже");
        } else if (position == 2) {
            System.out.println("Спокойной ночи");
        }
        else  {
            System.out.println("Песня не найдена");
        }
    }
    public static void main (String [] args){
            Jukebox position = new Jukebox();
            String song = "I believe, I can fly";
            Jukebox.music(1);
            Jukebox.music(2);
            Jukebox.music(0);
            Jukebox.music(105);
        }
    }
