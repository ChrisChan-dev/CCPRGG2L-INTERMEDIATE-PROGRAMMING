import java.util.Scanner;

public class RestaurantBillSplitter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter number of friends: ");
        int friends = input.nextInt();

        if (friends < 1) {
            System.out.println("Error: Number of friends must be at least 1.");
            return;
        }

        double subtotal = 0;

        System.out.println("\n--- Enter Orders for 5 Items ---");
        
        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter Price of item " + i + ": ");
            double price = input.nextDouble();
            
            System.out.print("Enter Quantity of item " + i + ": ");
            int quantity = input.nextInt();
            
            subtotal += (price * quantity);
        }

        double serviceCharge = subtotal * 0.05;

        double totalBeforeDiscount = subtotal + serviceCharge;

        double discountAmount = 0;
        if (totalBeforeDiscount > 1000) {
            discountAmount = totalBeforeDiscount * 0.15;
        }

        double finalTotal = totalBeforeDiscount - discountAmount;

        double perHead = finalTotal / friends;
        
        System.out.println("\n--------------------------------");
        System.out.println("         BILL SUMMARY           ");
        System.out.println("--------------------------------");
        
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
