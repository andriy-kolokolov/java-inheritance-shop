package org.experis.lessons;

public class Headphones extends Product {

    private final String color;
    private final String type;

    public Headphones(String name, String description, double price, double vat, String color, String type) {
        super(name, description, price, vat);
        this.color = color;
        this.type = type;
    }

    public Headphones(String name, String description, double price, String color, String type) {
        super(name, description, price);
        this.color = color;
        this.type = type;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\n - color: " + color +
                "\n - type: " + type;
    }
}
