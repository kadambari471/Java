package Lab_Projects;

import java.util.Scanner;

public class RemoveVowels {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        
        // Read the input string
        String input = scanner.nextLine();
        
        // Remove all vowels from the string
        String result = input.replaceAll("[AEIOUaeiou]", "");
        
        // Print the result
        System.out.println("String after removing vowels: " + result);
        
        // Close the scanner
        scanner.close();
    }
}
