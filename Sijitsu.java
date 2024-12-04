/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author Student
 */
public class Sijitsu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] products = {"Chocolate", "Strawberry", "Vanilla", "Bubblegum", "Mango"};
        double[] prices = {1.0, 0.5, 0.8, 2.0, 1.5};

        while (true) {
            System.out.println("\nWelcome to Sijitsu's Ice Cream Store!");
            System.out.println("Available flavours:");
            for (int i = 0; i < products.length; i++) {
                System.out.println((i + 1) + ". " + products[i] + " - $" + prices[i]);
            }

            double totalCost = 0;
            while (true) {
                System.out.print("Enter product number (0 to finish): ");
                int choice = scanner.nextInt();
                if (choice == 0) {
                    break;
                }

                if (choice < 1 || choice > products.length) {
                    System.out.println("Invalid choice. Try again.");
                    continue;
                }

                String productName = products[choice - 1];
                System.out.print("How many " + productName + "(s) do you want? ");
                int quantity = scanner.nextInt();
                totalCost += prices[choice - 1] * quantity;
            }

            System.out.println("Total cost: $" + totalCost);
            System.out.print("Enter payment: ");
            double payment = scanner.nextDouble();

            if (payment >= totalCost) {
                System.out.println("Change: $" + (payment - totalCost));
                System.out.println("Thank you for shopping!");
            } else {
                System.out.println("Insufficient payment. Transaction canceled.");
            }

            System.out.print("Do you want to make another purchase? (yes/no): ");
            scanner.nextLine(); // Consume newline
            String anotherPurchase = scanner.nextLine();
            if (!anotherPurchase.equalsIgnoreCase("yes")) {
                break;
            }
        }

        System.out.println("Goodbye! Have a lovely day");
        scanner.close();
    }
}