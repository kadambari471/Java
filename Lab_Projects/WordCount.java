	package Lab_Projects;
	
	import java.util.Scanner;

	public class WordCount {
	    public static void main(String[] args) {
	        // Create a Scanner object for input
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a word: ");
	        
	        // Read the input word
	        String word = scanner.nextLine().toUpperCase();
	        System.out.print("Enter a sentence: ");
	        
	        // Read the input sentence
	        String sentence = scanner.nextLine().toUpperCase();
	        
	        // Split the sentence into words
	        String[] words = sentence.split("\\s+");
	        
	        // Count occurrences of the word
	        int count = 0;
	        for (String w : words) {
	            if (w.equals(word)) {
	                count++;
	            }
	        }
	        
	        // Print the result
	        System.out.println("The word '" + word + "' appears " + count + " times in the sentence.");
	        
	        // Close the scanner
	        scanner.close();
	    }
	}
