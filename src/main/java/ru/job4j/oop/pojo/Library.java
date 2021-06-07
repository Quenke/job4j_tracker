package ru.job4j.oop.pojo;

public class Library {
    public static void main(String[] args) {
        Book first = new Book("First", 150);
        Book second = new Book("Second", 235);
        Book third = new Book("Third", 95);
        Book fourth = new Book("Clean code", 1);
        Book books[] = new Book[4];
        books[0] = first;
        books[1] = second;
        books[2] = third;
        books[3] = fourth;
        for (int index = 0; index < books.length; index++) {
            Book bs = books[index];
            System.out.println(bs.getName() + " - " + bs.getPages());
        }
            System.out.println("Поменять местами 0 и 3");
            for (int index1 = 0; index1 < books.length; index1++) {
                Book bsChange = books[index1];
                Book temp = books[0];
                books[0] = books[books.length - 1];
                books[books.length - 1] = temp;
                System.out.println(bsChange.getName() + " - " + bsChange.getPages());
            }
            System.out.println("Вывести только Clean code");
            for (int index2 = 0; index2 < books.length; index2++) {
                Book bsEqual = books[index2];
                System.out.println();
            }

    }
}
