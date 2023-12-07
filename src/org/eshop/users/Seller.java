package org.eshop.users;

import java.util.Scanner;

public class Seller extends LoggedUser implements User {

    private int sellerKey;


    @Override
    public void signup() {
        super.signup();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter seller key: ");
        this.sellerKey = scanner.nextInt();
        System.out.println("Ready to sell! Welcome " + getUsername() + "!");
    }

    @Override
    public void login() {
        super.login();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter seller key: ");
        this.sellerKey = scanner.nextInt();
        System.out.println("Ready to sell! Welcome " + getUsername() + "!");

    }

    public int getSellerKey() {
        return sellerKey;
    }

    @Override
    public void browseCatalog() {

    }


}
