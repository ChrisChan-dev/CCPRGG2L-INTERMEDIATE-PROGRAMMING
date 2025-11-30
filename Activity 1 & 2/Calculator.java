public class BasicCalculator {
    public static void main(String[] args) {
        
        double num1 = 20;
        double num2 = 5;

        double sum = num1 + num2;
        double difference = num1 - num2;
        double product = num1 * num2;
        double quotient = num1 / num2;

        System.out.println("Numbers: " + num1 + " and " + num2);
        System.out.println("Addition: " + sum);
        System.out.println("Subtraction: " + difference);
        System.out.println("Multiplication: " + product);
        System.out.println("Division: " + quotient);
    }
}
