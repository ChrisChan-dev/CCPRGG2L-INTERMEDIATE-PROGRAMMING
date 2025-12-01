import java.util.Scanner;

public class InputExample {
    public static void main(String[] args) {
    // Create a Scanner object to take input
    Scanner scanner = new Scanner(System.in);
    // Reading a String input
    System.out.print("Enter your name: ");
    String name = scanner.nextLine();
    // Reading an Integer input
    System.out.print("Enter your age: ");
    int age = scanner.nextInt();
    // Reading a Double input
    System.out.print("Enter your salary: ");
    double salary = scanner.nextDouble();
    // Output the values entered
    System.out.println("Name: " + name);
    System.out.println("Age: " + age);
    System.out.printf("Salary: $%.2f\n", salary);
    }
}