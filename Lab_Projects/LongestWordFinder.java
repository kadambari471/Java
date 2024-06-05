package Lab_Projects;

import java.util.Scanner;

public class LongestWordFinder {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        
        // Read the input sentence
        String sentence = scanner.nextLine();
        
        // Split the sentence into words
        String[] words = sentence.split("\\s+");
        
        // Initialize variables to keep track of the longest word
        String longestWord = "";
        
        // Iterate through each word to find the longest one
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        
        // Print the longest word
        System.out.println("The longest word is: " + longestWord);
        
        // Close the scanner
        scanner.close();
    }
}
