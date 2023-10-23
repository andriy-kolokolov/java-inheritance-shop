package org.experis.lessons;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<>();
        products.add(new Product("Smartphone", "Galaxy 21+ ultra", 700.00));
        products.add(new Product("PC", "Apple Laptop", 2000.00, 0.10));
        products.add(new Product("PC", "Asus Laptop", 1200.00));
        products.add(new Product("Smartphone", "Iphone 15 Pro", 3000.00, 0.46));


    }
}
