package org.eshop.users;

import java.util.Scanner;

public  class Client implements User{

    private String username;
    private String password;


    @Override
    public void signup() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter username: ");
        username = scanner.nextLine();
        System.out.println("Enter password: ");
        password = scanner.nextLine();
        System.out.println("You have successfully signed up! Welcome " + username + "!");
    }

    @Override
    public void login() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter username: ");
        username = scanner.nextLine();
        System.out.println("Enter password: ");
        password = scanner.nextLine();
        System.out.println("You have successfully logged in! Welcome " + username + "!");
    }

    @Override
    public void browseCatalog() {

    }
}
