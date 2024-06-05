package Lab_Projects;

import java.util.Scanner;

public class EvenOddArray {

	public static void main(String[] args) {
			 // Create a scanner object to take user input
		    Scanner scanner = new Scanner(System.in);

		 // Initialize arrays to store even and odd numbers
		    int[] arr = new int[20];
		    int[] even = new int[20];
		    int[] odd = new int[20];
		    int evenCount = 0, oddCount = 0;


		    // Input 20 numbers into the array
		    System.out.println("Enter 20 numbers:");
		    
		    for(int i=0;i<20;i++) {
		    	System.out.println("Enter number"+(i+1)+":");
		    	arr[i]= scanner.nextInt();
		    }
		    
		    // Separate even and odd numbers into different arrays
		    for (int i = 0; i < 20; i++) {
		        if (arr[i] % 2 == 0) {
		            even[evenCount++] = arr[i];
		        } else {
		            odd[oddCount++] = arr[i];
		        }
			}
		    
		    // Print the elements of the even array
		    System.out.println("Even numbers:");
		    for (int i = 0; i < evenCount; i++) {
		        System.out.print(even[i] + " ");
		    }
		    System.out.println();

		    // Print the elements of the odd array
		    System.out.println("Odd numbers:");
		    for (int i = 0; i < oddCount; i++) {
		        System.out.print(odd[i] + " ");
		    }
	  }
}