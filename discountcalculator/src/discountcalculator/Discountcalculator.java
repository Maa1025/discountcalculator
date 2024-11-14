package discountcalculator;
//libarary
import java.util.Scanner;
//class name
public class Discountcalculator {

    public static void main(String[] args) {
        
        //Declare variable
        String itemName;
        double pricePerItem;
        double discountRate;
        int quantity;
        int discountChoice;
         Scanner input = new Scanner(System.in);

        // Input item details
        System.out.println("Enter the item name: ");
        itemName = input.nextLine();

        System.out.println("Enter the price per item: ");
        pricePerItem = input.nextDouble();

        System.out.println("Enter the quantity: ");
        quantity = input.nextInt();

        // Display discount menu
        System.out.println("Select the discount rate by entering the corresponding number:");
        System.out.println("1. Red (10%)");
        System.out.println("2. Blue (15%)");
        System.out.println("3. Green (20%)");
        System.out.println("4. Yellow (25%)");

        // Input discount choice
        discountChoice = input.nextInt();

        // Determine the discount rate
        if (discountChoice == 1) {
            discountRate = 0.10;
        } else if (discountChoice == 2) {
            discountRate = 0.15;
        } else if (discountChoice == 3) {
            discountRate = 0.20;
        } else if (discountChoice == 4) {
            discountRate = 0.25;
        } else {
            System.out.println("Invalid choice. No discount applied.");
            discountRate = 0.0;
        }

        // Formula total price and price after discount
        double totalPrice = pricePerItem * quantity;
        double discountAmount = totalPrice * discountRate;
        double priceAfterDiscount = totalPrice - discountAmount;

        // Display results
        System.out.println("Item Name: " + itemName);
        System.out.println("Price per Item: $" + pricePerItem);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Price: $" + totalPrice);
        System.out.println("Discount Rate: " + (discountRate * 100) + "%");
        System.out.println("Price after Discount: $" + priceAfterDiscount);

        input.close();
    }
    
}
