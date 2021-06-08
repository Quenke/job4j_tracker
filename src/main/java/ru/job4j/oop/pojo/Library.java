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
        Book temp = books[3];
        books[3] = books[0];
        books[0] = temp;

        System.out.println("Поменять местами 0 и 3 ячейки");
        for (int index = 0; index < books.length; index++) {
            Book bsChange = books[index];
            System.out.println(bsChange.getName() + " - " + bsChange.getPages());
        }

        System.out.println("Вывод на экран только книгу с названием Clean code");
        for (int index = 0; index < books.length; index++) {
            Book bsEqual = books[index];
            if (bsEqual.getName().equals("Clean code")) {
                System.out.println(bsEqual.getName() + " - " + bsEqual.getPages());
            }
        }
    }
}
