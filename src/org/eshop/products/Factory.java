package org.eshop.products;

public abstract class Factory {

    public Product createProduct(String name, String category, double price) {
        Product product = createProduct();
        product.setName(name);
        product.setCategory(category);
        product.setPrice(price);
        return product;
    }

    public abstract Product createProduct();


}
