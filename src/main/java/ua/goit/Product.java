package ua.goit;

public class Product {
    private String name;
    private double price;
    private int promQuantity;
    private double promPrice;

    public Product(String name, double price, int promQuantity, double promPrice) {
        this.name = name;
        this.price = price;
        this.promQuantity = promQuantity;
        this.promPrice = promPrice;
    }

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getPromQuantity() {
        return promQuantity;
    }

    public void setPromQuantity(int promQuantity) {
        this.promQuantity = promQuantity;
    }

    public double getPromPrice() {
        return promPrice;
    }

    public void setPromPrice(double promPrice) {
        this.promPrice = promPrice;
    }
}
