package Lab_Projects;
import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        // Create a scanner object to take user input
        Scanner scanner = new Scanner(System.in);
        
        // Initialize variables to store sums
        int twoDigitSum = 0;
        int threeDigitSum = 0;
        
        // Input 10 integers
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter an integer: ");
            int num = scanner.nextInt();
            
            // Check if the number is two-digit or three-digit
            if (num >= 10 && num <= 99) {
                twoDigitSum += num; // Add to the sum of two-digit numbers
            } else if (num >= 100 && num <= 999) {
                threeDigitSum += num; // Add to the sum of three-digit numbers
            }
        }
        
        // Print the sums
        System.out.println("Sum of two-digit numbers: " + twoDigitSum);
        System.out.println("Sum of three-digit numbers: " + threeDigitSum);
    }
}
