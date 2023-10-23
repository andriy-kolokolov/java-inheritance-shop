package org.experis.lessons;

import java.util.Random;

public class Product {
    private final String id;
    private String name;
    private String description;
    private double price;
    private double vat;

    public Product(String name, String description, double price, double vat) {
        this.id = String.format("%08d", new Random().nextInt(100000000));
        this.name = name;
        this.description = description;
        this.price = price;
        this.vat = vat;
    }

    // Default constructor with a default 0.22 vat
    public Product(String name, String description, double price) {
        this(name, description, price, 0.22);
    }

    @Override
    public String toString() {
        return "Product " + getId() + ':' +
                "\n - id: " + id +
                "\n - name: " + name +
                "\n - description: " + description +
                "\n - net price: " + String.format("%.2f", this.price) +
                "\n - gross price(including vat price): " + String.format("%.2f", price) +
                "\n - " + (vat == 0.22 ? "default vat: " + vat : "custom vat: " + vat);
    }

    public double getVatPrice() {
        return price * vat + price;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getVat() {
        return vat;
    }

    public void setVat(double vat) {
        this.vat = vat;
    }
}