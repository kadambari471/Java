package Lab_Projects;
import java.util.Scanner;
public class Palindrome {
public static void main(String args[]){ 
		
		Scanner sc=new Scanner(System.in);
		  
		int r,sum=0,temp; 

		   System.out.println("Enter the number to check whether it is palindrome number or not :- ");
		  int n= sc.nextInt() ;//It is the input number variable to be checked for palindrome  
		  
		  temp=n;    // user input stored in temp
		 
		  while(n>0){    
		   r=n%10;  //getting remainder  
		   sum=(sum*10)+r;    
		   n=n/10;    
		  }    
		  
		  if(temp==sum)  // if the given number and the derived numbers are same  
		   System.out.println("palindrome number ");    
		  else    
		   System.out.println("not palindrome");    
	}
}
