package org.eshop.users;

public class Guest implements User{

    @Override
    public void signup() {
        throw new UnsupportedOperationException("Not supported yet. Guests cannot sign up.");
    }

    @Override
    public void login() {
        throw new UnsupportedOperationException("Not supported yet. Guests cannot log in.");
    }

    @Override
    public void browseCatalog() {

    }
}
