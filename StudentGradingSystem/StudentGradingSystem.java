import java.util.Scanner;

public class StudentGradingSystem {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int choice;
            int score = -1;
            String grade = "N/A";
            String remarks = "N/A";
            
            do {
                System.out.println("\n===== Student Grading System =====");
                System.out.println("1. Enter new score");
                System.out.println("2. Display last grade");
                System.out.println("3. Exit");
                System.out.print("Choose an option: ");
                choice = sc.nextInt();
                
                switch (choice) {
                    
                    case 1 -> {
                        System.out.print("\nEnter student score: ");
                        score = sc.nextInt();
                        
                        // Check if score is valid
                        if (score < 0 || score > 100) {
                            System.out.println("Invalid score! Please enter a value between 0 and 100.");
                            break;
                        }
                        
                        // Determine grade using if-else-if
                        if (score >= 90) {
                            grade = "A";
                        } else if (score >= 80) {
                            grade = "B";
                        } else if (score >= 70) {
                            grade = "C";
                        } else if (score >= 60) {
                            grade = "D";
                        } else {
                            grade = "F";
                        }
                        
                        // Nested if for remarks
                        remarks = "No special remarks";
                        if (grade.equals("A")) {
                            if (score >= 95) {
                                remarks = "Excellent!";
                            }
                        } else if (grade.equals("F")) {
                            if (score < 40) {
                                remarks = "Needs Improvement!";
                            }
                        }
                        
                        System.out.println("Grade: " + grade);
                        System.out.println("Remarks: " + remarks);
                    }
                    
                    case 2 -> {
                        if (score == -1) {
                            System.out.println("\nNo grade recorded yet.");
                        } else {
                            System.out.println("\nLast Grade: " + grade);
                            System.out.println("Remarks: " + remarks);
                        }
                    }
                    
                    case 3 -> System.out.println("\nExiting program...");
                    
                    default -> System.out.println("\nInvalid option. Please choose 1, 2, or 3.");
                }
                
            } while (choice != 3);
        }
    }
}
