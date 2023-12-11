package org.eshop.products;

public class Book implements Product {

    private String name;
    private String category;
    private double price;

    private int stock;


    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getCategory() {
        return category;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public int getStock() {
        return stock;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public void displayProductInfo() {
        System.out.println("Product name: " + getName());
        System.out.println("Product category: " + getCategory());
        System.out.println("Product price: " + getPrice());
        System.out.println("Product stock: " + getStock());
    }
}

