package Lab_Projects;

import java.util.Arrays;
import java.util.Scanner;

public class StringArraySort {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of strings: ");
        
        // Read the number of strings
        int n = scanner.nextInt();
        scanner.nextLine();  // Consume the newline
        
        // Create an array to hold the strings
        String[] strings = new String[n];
        
        // Read each string into the array
        for (int i = 0; i < n; i++) {
            System.out.print("Enter string " + (i + 1) + ": ");
            strings[i] = scanner.nextLine();
        }
        
        // Sort the array of strings in ascending order
        Arrays.sort(strings);
        
        // Print the sorted array
        System.out.println("Sorted strings: ");
        for (String str : strings) {
            System.out.println(str);
        }
        
        // Close the scanner
        scanner.close();
    }
}
