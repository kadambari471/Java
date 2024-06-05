package Lab_Projects;

import java.util.Scanner;

public class DisplayInitials {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a name (three words): ");
        
        // Read the input name
        String name = scanner.nextLine();
        
        // Split the name into words
        String[] words = name.split("\\s+");
        
        // Create a string to hold the initials
        String initials = "";
        
        // Iterate through each word to get the first letter
        for (String word : words) {
            initials += word.charAt(0) + " ";
        }
        
        // Print the initials
        System.out.println("Initials: " + initials.trim());
        
        // Close the scanner
        scanner.close();
    }
}
