package Lab_Projects;

import java.util.Scanner;
import java.util.Scanner;

public class SentenceAnalysis {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        
        // Read the input sentence
        String sentence = scanner.nextLine();
        
        // Initialize counters
        int vowels = 0, digits = 0, words = 0, specialChars = 0;
        
        // Define vowels for comparison
        String vowelList = "AEIOUaeiou";
        
        // Split the sentence into words
        String[] wordArray = sentence.split("\\s+");
        words = wordArray.length;
        
        // Iterate through each character in the sentence
        for (char c : sentence.toCharArray()) {
            if (Character.isDigit(c)) {
                digits++;
            } else if (vowelList.indexOf(c) != -1) {
                vowels++;
            } else if (!Character.isLetterOrDigit(c) && !Character.isWhitespace(c)) {
                specialChars++;
            }
        }
        
        // Print the results
        System.out.println("Vowels: " + vowels);
        System.out.println("Digits: " + digits);
        System.out.println("Words: " + words);
        System.out.println("Special Characters: " + specialChars);
        
        // Close the scanner
        scanner.close();
    }
}
