package org.eshop.products;

public abstract class ProductFactory {

    public Product createProduct(String name, String category, double price, int stock) {
        Product product = createProduct();
        product.setName(name);
        product.setCategory(category);
        product.setPrice(price);
        product.setStock(stock);
        return product;
    }

    public abstract Product createProduct();


}
