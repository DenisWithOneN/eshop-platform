package org.eshop.entrance;

import java.util.Scanner;

public class EntranceChoice {

    public static Entrance getEntrance(int choice) {
        switch(choice) {
            case 1:
                return new ClientEntry();
            case 2:
                return new SellerEntry();
            case 3:
                return new GuestEntry();
            default:
                return null;
        }
    }

    public static void enterShop(String[] args) {
        System.out.println("How would you like to proceed?");
        System.out.println("1. Client");
        System.out.println("2. Seller");
        System.out.println("3. Guest");

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        Entrance entranceStrategy = getEntrance(choice);
        // if the choice is 1 or 2, then the user is a client or a seller and can sign up or log in
        if(choice != 3) {
            System.out.println("Press 1 to log in or 2 to sign up.");
            int choice2 = scanner.nextInt();
            if(choice2 == 1) {
                entranceStrategy.LogInShop();
            } else if(choice2 == 2) {
                entranceStrategy.SignUpShop();
            } else {
                System.out.println("Invalid choice.");
            }
            // if the choice is 3, then the user is a guest and cannot sign up and automatically logs in
        } else if (choice == 3){
            entranceStrategy.LogInShop();
        } else {
            System.out.println("Invalid choice.");
        }
    }
}
