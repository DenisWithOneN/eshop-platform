package org.eshop.products;

public class BookFactory extends Factory {

    @Override
    public Product createProduct() {
        return new Book();
    }
}
