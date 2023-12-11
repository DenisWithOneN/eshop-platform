package org.eshop.products;

import java.util.ArrayList;
import java.util.List;

public abstract class ProductFactory {

    List<Product> products = new ArrayList<>();

    public Product createProduct(String name, String category, double price, int stock) {
        Product product = createProduct();
        product.setName(name);
        product.setCategory(category);
        product.setPrice(price);
        product.setStock(stock);
        products.add(product);
        return product;
    }

    public abstract Product createProduct();

    public void displayAllProducts() {
        System.out.println("All Products:");
        for (Product product : products) {
            displayProductInfo(product);
        }


    }

    private void displayProductInfo(Product product) {
        System.out.println("Name: " + product.getName());
        System.out.println("Category: "     + product.getCategory());
        System.out.println("Price: " + product.getPrice());
        System.out.println("Stock: " + product.getStock());
    }

}
