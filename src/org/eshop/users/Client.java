package org.eshop.users;

import java.util.Scanner;

public  class Client implements User{

    private String username;
    private String password;


    @Override
    public void signup() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter username: ");
        this.username = scanner.nextLine();
        System.out.print("Enter password: ");
        this.password = scanner.nextLine();
        System.out.println("You have successfully signed up! Welcome " + username + "!");
    }

    @Override
    public void login() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter username: ");
        this.username = scanner.nextLine();
        System.out.print("Enter password: ");
        this.password = scanner.nextLine();
        System.out.println("You have successfully logged in! Welcome " + username + "!");
    }

    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return username;
    }

    @Override
    public void browseCatalog() {

    }
}
