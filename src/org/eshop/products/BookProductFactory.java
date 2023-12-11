package org.eshop.products;

public class BookProductFactory extends ProductFactory {

    @Override
    public Product createProduct() {
        return new Book();
    }
}
