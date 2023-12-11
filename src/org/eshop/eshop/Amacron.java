package org.eshop.eshop;

import org.eshop.entrance.*;
import org.eshop.products.ProductFactory;
import org.eshop.products.Product;
import org.eshop.products.WalletProductFactory;
import org.eshop.users.Seller;


public class Amacron {

    public static void main(String[] args) {

        System.out.println("Welcome to Amacron!");
        System.out.println("====================================");
        EntranceChoice.enterShop(args);
        System.out.println("====================================");
        ProductFactory factory = new WalletProductFactory();
        Product wallet = factory.createProduct("Wallet", "Accessories", 100, 10);


        Seller seller = new Seller();
        seller.addProduct(factory);


    }


}
