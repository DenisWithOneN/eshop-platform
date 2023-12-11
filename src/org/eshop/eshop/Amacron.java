package org.eshop.eshop;

import org.eshop.entrance.*;
import org.eshop.products.Factory;
import org.eshop.products.Product;
import org.eshop.products.WalletFactory;


public class Amacron {

    public static void main(String[] args) {

        System.out.println("Welcome to Amacron!");
        System.out.println("====================================");
        EntranceChoice.enterShop(args);
        System.out.println("====================================");
        Factory factory = new WalletFactory();
        Product wallet = factory.createProduct("Wallet", "Accessories", 100);

        System.out.println("Product info: ");
        System.out.println("Name: " + wallet.getName());
        System.out.println("Category: " + wallet.getCategory());
        System.out.println("Price: " + wallet.getPrice());



    }


}
