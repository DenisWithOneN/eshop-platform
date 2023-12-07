package org.eshop.users;

import java.util.Scanner;

public abstract class LoggedUser implements User {

    private String username;
    private String password;

    @Override
    public void signup() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter username: ");
        this.username = scanner.nextLine();
        System.out.print("Enter password: ");
        this.password = scanner.nextLine();
    }

    @Override
    public void login() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter username: ");
        this.username = scanner.nextLine();
        System.out.print("Enter password: ");
        this.password = scanner.nextLine();
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
