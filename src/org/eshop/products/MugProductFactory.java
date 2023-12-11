package org.eshop.products;

public class MugProductFactory extends ProductFactory {

    @Override
    public Product createProduct() {
        return new Mug();
    }
}
