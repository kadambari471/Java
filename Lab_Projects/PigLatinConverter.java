package Lab_Projects;

import java.util.Scanner;

public class PigLatinConverter {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word: ");
        
        // Read the input word
        String word = scanner.nextLine().toUpperCase();
        
        // Find the first vowel in the word
        int vowelIndex = -1;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                vowelIndex = i;
                break;
            }
        }
        
        // Convert to Pig Latin
        String pigLatin;
        if (vowelIndex == 0) {
            // Word begins with a vowel
            pigLatin = word;
        } else if (vowelIndex != -1) {
            // Word has a vowel
            pigLatin = word.substring(vowelIndex) + word.substring(0, vowelIndex) + "AY";
        } else {
            // No vowel found
            pigLatin = word;
        }
        
        // Print the Pig Latin word
        System.out.println("Pig Latin: " + pigLatin);
        
        // Close the scanner
        scanner.close();
    }
}
