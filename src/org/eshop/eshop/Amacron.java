package org.eshop.eshop;

import org.eshop.users.Client;

public class Amacron {

    public static void main(String[] args) {

        Client client = new Client();
        client.signup();

        System.out.println("Client info: ");
        System.out.println("Username: " + client.getUsername());
        System.out.println("Password: " + client.getPassword());
    }
}
