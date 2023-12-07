package org.eshop.eshop;

import org.eshop.users.Client;
import org.eshop.users.Seller;

public class Amacron {

    public static void main(String[] args) {

//        Client client = new Client();
//        client.signup();
//
//        System.out.println("Client info: ");
//        System.out.println("Username: " + client.getUsername());
//        System.out.println("Password: " + client.getPassword());

        System.out.println("====================================");

        Seller seller = new Seller();
        seller.signup();

        System.out.println("Seller info: ");
        System.out.println("Username: " + seller.getUsername());
        System.out.println("Password: " + seller.getPassword());
        System.out.println("Seller key: " + seller.getSellerKey());
    }
}
