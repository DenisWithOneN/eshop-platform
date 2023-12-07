package org.eshop.users;

import java.util.Scanner;

public  class Client extends LoggedUser implements User  {

    @Override
    public void signup() {
        super.signup();
        System.out.println("You have successfully signed up! Welcome " + getUsername() + "!");
    }

    @Override
    public void login() {
        super.login();
        System.out.println("You have successfully logged in! Welcome " + getUsername() + "!");
    }



    @Override
    public void browseCatalog() {

    }
}
