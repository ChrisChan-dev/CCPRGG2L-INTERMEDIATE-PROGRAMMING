import java.util.Scanner;

public class GroceryStoreCalculator {
    public static void main(String[] args) {
        // Create Scanner object to get input
        Scanner input = new Scanner(System.in);

        // Declare variables for item prices
        double item1, item2, item3, total, discountedTotal;

        // Prompt the user for input
        System.out.print("Enter price of item 1: ");
        item1 = input.nextDouble();

        System.out.print("Enter price of item 2: ");
        item2 = input.nextDouble();

        System.out.print("Enter price of item 3: ");
        item3 = input.nextDouble();

        // Calculate the total price
        total = item1 + item2 + item3;
        System.out.println("Original Total: " + total);

        // Check if a discount applies and calculate the discounted total
        if (total > 500) {
            discountedTotal = total * 0.9; // 10% discount
            System.out.println("Discounted Total: " + discountedTotal);
        } else {
            System.out.println("No discount applied.");
        }
    }
}