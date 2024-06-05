package Lab_Projects;

	 import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        
        // Read the input string
        String input = scanner.nextLine();
        
        // Remove any non-alphanumeric characters and convert to lower case
        String cleanedInput = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        
        // Reverse the cleaned input
        String reversedInput = new StringBuilder(cleanedInput).reverse().toString();
        
        // Check if the cleaned input is equal to the reversed input
        if (cleanedInput.equals(reversedInput)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
        
        // Close the scanner
        scanner.close();
    }
}
