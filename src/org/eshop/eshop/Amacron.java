package org.eshop.eshop;

import org.eshop.products.Factory;
import org.eshop.products.Product;
import org.eshop.products.Wallet;
import org.eshop.products.WalletFactory;
import org.eshop.users.Client;
import org.eshop.users.Guest;
import org.eshop.users.Seller;

public class Amacron {

    public static void main(String[] args) {

        Client client = new Client();
        client.signup();

        System.out.println("Client info: ");
        System.out.println("Username: " + client.getUsername());
        System.out.println("Password: " + client.getPassword());

        System.out.println("====================================");

        Seller seller = new Seller();
        seller.signup();

        System.out.println("Seller info: ");
        System.out.println("Username: " + seller.getUsername());
        System.out.println("Password: " + seller.getPassword());
        System.out.println("Seller key: " + seller.getSellerKey());

        System.out.println("====================================");

        Guest guest = new Guest();
        guest.login();

        System.out.println("====================================");

        Factory factory = new WalletFactory();
        Product wallet = factory.createProduct("Wallet", "Accessories", 100);

        System.out.println("Product info: ");
        System.out.println("Name: " + wallet.getName());
        System.out.println("Category: " + wallet.getCategory());
        System.out.println("Price: " + wallet.getPrice());



    }
}
