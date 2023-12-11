package org.eshop.entrance;

import org.eshop.users.Client;

public class ClientEntry implements Entrance {

    @Override
    public void LogInShop() {
        Client client = new Client();
        client.login();
    }

    @Override
    public void SignUpShop() {
        Client client = new Client();
        client.signup();

    }
}
