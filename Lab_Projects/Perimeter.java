package Lab_Projects;


import java.util.Scanner;
public class Perimeter {
	public static void main(String args []) {
		        Scanner sc = new Scanner(System.in);
		        System.out.println("Enter the given number to find the perimeter of that shape :" +
		                 "\nPress \n 1 = Circle \n 2 = Rectangle \n 3 = square \n");
		        int n = sc.nextInt(); // user input
		        switch (n){
		                case 1:
		                System.out.println("You are finding the perimeter of Circle, please enter the radius = ");
		                float a = sc.nextFloat();
		                double A2 = 2*3.14*a;  // perimeter of Circle formula
		                System.out.println("perimeter = " + A2);
		                break;
		                case 2:
		                System.out.println("You are finding the perimeter of Rectangle, please enter the Length & Bredth = ");
		                float L = sc.nextFloat();
		                float B = sc.nextFloat();
		                float A3 = 2*(L + B);  // perimeter of Rectangle formula
		                System.out.println("perimeter = " + A3);
		                break;
		                case 3:
				System.out.println("You are finding the perimeter of Square, please enter the side = ");
				float s = sc.nextFloat();                
				float A4 = 4*s;  // perimeter of Square formula
		                System.out.println("perimeter = " + A4);
				break;
		                default:
		                System.out.println("You Have Entered a Wrong Number.");
		                }
		               }
		}
