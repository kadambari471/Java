package Lab_Projects;

import java.util.Scanner;

public class SentenceReverser {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        
        // Read the input sentence
        String sentence = scanner.nextLine();
        
        // Split the sentence into words
        String[] words = sentence.split("\\s+");
        
        // Reverse the order of the words
        StringBuilder reversedSentence = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            reversedSentence.append(words[i]).append(" ");
        }
        
        // Print the reversed sentence
        System.out.println("Reversed sentence: " + reversedSentence.toString().trim());
        
        // Close the scanner
        scanner.close();
    }
}
