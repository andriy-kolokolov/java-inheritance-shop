package org.experis.lessons;

public class Tv extends Product {

    /**************************************************
     * SIZE RAPRESENTS SCREEN DIAGONAL
     **************************************************/
    private int size;
    private Boolean isSmart;

    public Tv(String name, String description, double price, double vat, int size, Boolean isSmart) {
        super(name, description, price, vat);
        this.size = size;
        this.isSmart = isSmart;
    }

    public Tv(String name, String description, double price, int size, Boolean isSmart) {
        super(name, description, price);
        this.size = size;
        this.isSmart = isSmart;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\n - size: " + size +
                "\n - is smart?: " + isSmart;
    }

    public Tv(String name, String description, double price) {
        super(name, description, price);
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Boolean getSmart() {
        return isSmart;
    }

    public void setSmart(Boolean smart) {
        isSmart = smart;
    }
}

