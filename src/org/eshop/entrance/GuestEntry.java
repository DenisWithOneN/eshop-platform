package org.eshop.entrance;

public class GuestEntry implements Entrance {

    @Override
    public void LogInShop() {
        System.out.println("You are logged in as a guest.");
    }

    @Override
    public void SignUpShop() {
        throw new UnsupportedOperationException("Not supported yet. Guests cannot sign up.");
    }
}
