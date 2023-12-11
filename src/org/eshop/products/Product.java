package org.eshop.products;

public interface Product {



    String getName();

    String getCategory();

    double getPrice();

    int getStock();

    void setName(String name);

    void setCategory(String category);

    void setPrice(double price);

    void setStock(int stock);

    void displayProductInfo();


}
