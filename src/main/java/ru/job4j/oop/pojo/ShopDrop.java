package ru.job4j.oop.pojo;

public class ShopDrop {
    public static Product[] delete(Product[] products, int index) {
        Product product = products[index];
        for (index = 0; index < products.length - 1; index++) {
            if (product != null) {
                products[index] = products[index + 1];
            }
        }
        return products;
    }
}
