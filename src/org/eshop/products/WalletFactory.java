package org.eshop.products;

public class WalletFactory extends Factory {

    public Product createProduct() {
        return new Wallet();
    }
}
