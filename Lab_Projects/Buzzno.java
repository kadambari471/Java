package Lab_Projects;

import java.util.Scanner;

public class Buzzno {
    static {
        // Create a scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the first number
        System.out.println("Enter the first number: ");
        int num1 = scanner.nextInt();

        // Prompt the user to enter the second number
        System.out.println("Enter the second number: ");
        int num2 = scanner.nextInt();

        // Check if the first number is a Buzz Number
        if (num1 % 10 == 7 || num1 == 7) {
            System.out.println("First Number " + num1 + " is a Buzz Number");
        } else {
            System.out.println("First Number " + num1 + " is not a Buzz Number");
        }

        // Check if the second number is a Buzz Number
        if (num2 % 10 == 7 || num2 == 7) {
            System.out.println("Second Number " + num2 + " is a Buzz Number");
        } else {
            System.out.println("Second Number " + num2 + " is not a Buzz Number");
        }
    }

    public static void main(String[] args) {
        // Create an instance of the Buzzno class to execute the static block
        Buzzno buz = new Buzzno();
    }
}
