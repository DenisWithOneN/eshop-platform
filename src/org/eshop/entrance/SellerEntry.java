package org.eshop.entrance;

import org.eshop.users.Seller;

public class SellerEntry implements Entrance {

        @Override
        public void LogInShop() {
            Seller seller = new Seller();
            seller.login();

        }

        @Override
        public void SignUpShop() {
            Seller seller = new Seller();
            seller.signup();
        }
}
