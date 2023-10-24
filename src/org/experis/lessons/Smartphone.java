package org.experis.lessons;

public class Smartphone extends Product {
    private String imei;
    private double memory;

    public Smartphone(String name, String description, double price, double vat, String imei, double memory) {
        super(name, description, price, vat);
        this.imei = imei;
        this.memory = memory;
    }

    public Smartphone(String name, String description, double price, String imei, double memory) {
        super(name, description, price);
        this.imei = imei;
        this.memory = memory;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\n - imei: " + imei +
                "\n - memory: " + memory;
    }

    public Smartphone(String name, String description, double price, String imei) {
        super(name, description, price);
    }

    public String getImei() {
        return imei;
    }

    public double getMemory() {
        return memory;
    }

    public void setMemory(double memory) {
        this.memory = memory;
    }
}
