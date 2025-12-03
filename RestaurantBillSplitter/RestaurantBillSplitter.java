import java.util.Scanner;

public class RestaurantBillSplitter {
    public static void main(String[] args) {
        // Step 1: Create Scanner object
        Scanner input = new Scanner(System.in);

        // --- Step 2: Input ---
        
        // Get number of friends
        System.out.print("Enter number of friends: ");
        int friends = input.nextInt();

        // Check to ensure we don't divide by zero later
        if (friends < 1) {
            System.out.println("Error: Number of friends must be at least 1.");
            return; // Exit the program
        }

        // Initialize subtotal accumulator
        double subtotal = 0;

        // Loop to get Price and Quantity for 5 items
        System.out.println("\n--- Enter Orders for 5 Items ---");
        
        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter Price of item " + i + ": ");
            double price = input.nextDouble();
            
            System.out.print("Enter Quantity of item " + i + ": ");
            int quantity = input.nextInt();
            
            // Step 3 & 4: Accumulate subtotal using += operator
            subtotal += (price * quantity);
        }

        // --- Step 3 & 4: Calculations & Logic ---

        // Calculate Service Charge (5%)
        double serviceCharge = subtotal * 0.05;

        // Calculate Total Before Discount
        double totalBeforeDiscount = subtotal + serviceCharge;

        // Calculate Discount (15% if totalBeforeDiscount > 1000)
        double discountAmount = 0;
        if (totalBeforeDiscount > 1000) {
            discountAmount = totalBeforeDiscount * 0.15;
        }

        // Calculate Final Total
        double finalTotal = totalBeforeDiscount - discountAmount;

        // Calculate Amount per Friend
        double perHead = finalTotal / friends;

        // --- Step 5 & 6: Output & Formatting ---
        
        System.out.println("\n--------------------------------");
        System.out.println("         BILL SUMMARY           ");
        System.out.println("--------------------------------");
        
        // Using printf for 2 decimal places (%.2f) and new line (%n)
        System.out.printf("Subtotal:           ₱%.2f%n", subtotal);
        System.out.printf("Service Charge (5%%): ₱%.2f%n", serviceCharge);
        
        if (discountAmount > 0) {
            System.out.printf("Discount (15%%):    -₱%.2f%n", discountAmount);
        } else {
            System.out.println("Discount (15%):     No discount applied");
        }

        System.out.println("--------------------------------");
        System.out.printf("FINAL TOTAL:        ₱%.2f%n", finalTotal);
        System.out.printf("AMOUNT PER FRIEND:  ₱%.2f%n", perHead);
        System.out.println("--------------------------------");
    }
}