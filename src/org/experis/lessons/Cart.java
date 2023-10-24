package org.experis.lessons;

import java.util.ArrayList;
import java.util.Scanner;

public class Cart {
    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<>();

        boolean addingToCart = true;
        Scanner scanner = new Scanner(System.in);

        while (addingToCart) {
            System.out.println("Insert general product data (name, description, price) ");
            System.out.println("Name: ");
            String productName = scanner.nextLine();
            System.out.println("Description: ");
            String productDescription = scanner.nextLine();
            System.out.println("Price: ");
            double productPrice = scanner.nextDouble();
            scanner.nextLine();  // Consume the leftover newline character

            System.out.println("Select product type to add in cart: ");

            System.out.println("""
                    1: Headphones
                    2: Smartphone
                    3: TV
                    """);
            String userSelect = scanner.nextLine();

            switch (userSelect.toLowerCase()) {
                case "headphones": {
                    System.out.println("For headphones color and type required");
                    System.out.println("Color: ");
                    String headphonesColor = scanner.nextLine();
                    System.out.println("Type: ");
                    String headphonesType = scanner.nextLine();
                    products.add(new Headphones(
                            productName,
                            productDescription,
                            productPrice,
                            0.22,
                            headphonesColor,
                            headphonesType
                    ));
                    break;
                }
                case "smartphone": {
                    System.out.println("For smartphone imei and memory required");
                    System.out.println("IMEI: ");
                    String smartphoneIMEI = scanner.nextLine();
                    System.out.println("Memory: ");
                    double smartphoneMemory = scanner.nextDouble();
                    scanner.nextLine();  // Consume the leftover newline character
                    products.add(new Smartphone(
                            productName,
                            productDescription,
                            productPrice,
                            0.22,
                            smartphoneIMEI,
                            smartphoneMemory
                    ));
                    break;
                }
                case "tv": {
                    System.out.println("For TV color and type required");
                    System.out.println("Size (int): ");
                    int tvSize = scanner.nextInt();
                    scanner.nextLine();  // Consume the leftover newline character
                    System.out.println("Is smart (yes/no)? : ");
                    Boolean tvIsSmart = scanner
                            .nextLine()
                            .equalsIgnoreCase("yes");
                    products.add(new Tv(
                            productName,
                            productDescription,
                            productPrice,
                            0.22,
                            tvSize,
                            tvIsSmart
                    ));
                    break;
                }
            }
            System.out.println("Continue adding to cart ?");
            addingToCart = scanner.nextLine().equalsIgnoreCase("yes");
        }
        scanner.close();
        System.out.println("Your products in cart: ");
        for (Product product : products) {
            System.out.println(product.toString());
        }
    }
}
