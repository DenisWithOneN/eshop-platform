package org.eshop.products;

public class MugFactory extends Factory{

    @Override
    public Product createProduct() {
        return new Mug();
    }
}
