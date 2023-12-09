package org.eshop.products;

public interface Product {

    String name = "";
    String category = "";
    double price = 0.0;

    String getName();

    String getCategory();

    double getPrice();

    void setName(String name);

    void setCategory(String category);

    void setPrice(double price);
}
