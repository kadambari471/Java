package Lab_Projects;

import java.util.Scanner;

public class temp {
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9; //fahrenheit formula
    }

    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32; //celsius formula
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Temperature Conversion:");
        System.out.println("1. Fahrenheit to Celsius");
        System.out.println("2. Celsius to Fahrenheit");
        System.out.print("Enter your choice (1 or 2): ");
        int choice = scanner.nextInt(); // user input to choose either of them

        if (choice == 1) {
            System.out.print("Enter temperature in Fahrenheit: ");
            double fahrenheit = scanner.nextDouble();
            double celsius = fahrenheitToCelsius(fahrenheit); //Conversion
            System.out.println("Temperature in Celsius: " + celsius);
        } else if (choice == 2) {
            System.out.print("Enter temperature in Celsius: ");
            double celsius = scanner.nextDouble();
            double fahrenheit = celsiusToFahrenheit(celsius); //Conversion
            System.out.println("Temperature in Fahrenheit: " + fahrenheit);
        } else {
            System.out.println("Invalid choice. Please enter 1 or 2."); // number entered other than 1 & 2
        }
        scanner.close();
    }
}
