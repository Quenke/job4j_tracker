package ru.job4j.oop;

public class DummyDic {
    public String engToRus(String eng) {
        return ("Неизвестное слово. " + eng);
    }
    public static void main(String[] args) {
        DummyDic translation = new DummyDic();
        String eng = translation.toString();
        System.out.println("What a code O_o " + eng);
    }
}


