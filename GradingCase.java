import java.util.Scanner;

public class GradingCase {
    public static void main(String[] args) {
        // Personal info
        System.out.println("Name: John Rick P. Yanoyan");
        System.out.println("ID Number: 2024303300");
        System.out.println("------------------------------");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the student's score (0-100): ");
        int score = scanner.nextInt();

        char grade;

        if (score >= 90 && score <= 100) {
            grade = 'A';
        } else if (score >= 80) {
            grade = 'B';
        } else if (score >= 70) {
            grade = 'C';
        } else if (score >= 60) {
            grade = 'D';
        } else if (score >= 0) {
            grade = 'F';
        } else {
          
            System.out.println("Invalid score. Score must be between 0 and 100.");
            scanner.close();
            return;  
        }

        System.out.println("Result: The student's grade is " + grade + ".");
        scanner.close();
    }
}
