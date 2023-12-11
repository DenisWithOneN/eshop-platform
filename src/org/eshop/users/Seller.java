package org.eshop.users;


import org.eshop.products.Product;
import org.eshop.products.ProductFactory;

import java.util.Scanner;

public class Seller extends LoggedUser implements User {

    private int sellerKey;
    private ProductFactory productFactory;



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

    public Product addProduct(ProductFactory productFactory) {
        this.productFactory = productFactory;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter product name: ");
        String name = scanner.nextLine();
        System.out.print("Enter product category: ");
        String category = scanner.nextLine();
        System.out.print("Enter product price: ");
        double price = scanner.nextDouble();
        System.out.println("Product added successfully!");
        return productFactory.createProduct(name, category, price);

    }




}
