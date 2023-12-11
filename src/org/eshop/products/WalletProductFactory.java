package org.eshop.products;

public class WalletProductFactory extends ProductFactory {

    public Product createProduct() {
        return new Wallet();
    }
}
