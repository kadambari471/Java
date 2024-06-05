
package Lab_Projects;

import java.util.Scanner;

public class Score {
	
	public static void main(String args[]) {
		
		try (Scanner Scanner = new Scanner(System.in)) {
			System.out.println("Enter the marks in percentage for English :- ");
			
			int eng = Scanner.nextInt(); // user input 
			
			System.out.println("Enter the marks in percentage for Science :- ");
			
			int sci = Scanner.nextInt(); // user input 
			
			System.out.println("Enter the marks in percentage for Maths :- ");
			
			int math = Scanner.nextInt(); // user input 

			System.out.println("Marks of the candidate:-"+"\n English "+eng+"\n Science "+sci+"\n Maths   "+math);
			
			if(eng>=80 & sci>=80 & math>=80) { 
				// if the percentage are above and equal to 80 in all subjects

				System.out.println("The stream allotted to the candidate is Pure Science");
			}
			else if (eng>=80 & sci>=80 & math>=60) {
				// if the percentage is above and equal to 60 in math and above and equal to 80 in english & science
				
				System.out.println("The stream allotted to the candidate is Bio Science");
			}
			else if (eng>=60 & sci>=60 & math>=60) {
				// if the percentage are above and equal to 60 in all subjects
				
				System.out.println("The stream allotted to the candidate is Commerce");
			}
			else {
				System.out.println("Please Enter Valid Numbers");
			}
		}
		
		
	
	}
}
