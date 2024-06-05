package Lab_Projects;

public class Second_Large {

	public static void main(String args[]) {
		int[] a = {3,5,6,9,4,1,7}; // array
int largest = Integer.MIN_VALUE; // smallest value of integer
int sec_largest = Integer.MIN_VALUE; // smallest value of integer

	for(int i = 0; i<a.length; i++) { // loop to keep on checking and assigning the second large 
		if (a[i]>largest) {   
			sec_largest=largest; 
			largest=a[i];
		}
		else if (a[i]>sec_largest && a[i]!=largest) {
			sec_largest=a[i];
		}
		
	}
if(sec_largest==Integer.MIN_VALUE) {
			System.out.println("There is no second largest number in the list"); 
		}
		else {
			System.out.println("Second largest number is"+ sec_largest);
		}
	
}
}
