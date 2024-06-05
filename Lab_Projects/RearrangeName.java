package Lab_Projects;
import java.util.Scanner;

public class RearrangeName {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a name (three words): ");
        
        // Read the input name
        String name = scanner.nextLine();
        
        // Split the name into words
        String[] words = name.split("\\s+");
        
        // Ensure the name has exactly three words
        if (words.length == 3) {
            // Rearrange the name and print it
            System.out.println(words[2] + " " + words[0] + " " + words[1]);
        } else {
            System.out.println("Please enter a name containing exactly three words.");
        }
        
        // Close the scanner
        scanner.close();
    }
}
