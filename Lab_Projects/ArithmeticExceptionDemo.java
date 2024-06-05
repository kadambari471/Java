	package Lab_Projects;

	public class ArithmeticExceptionDemo {
	    public static void main(String[] args) {
	        try {
	            // Attempt to divide by zero
	            int result = 10 / 0;
	        } catch (ArithmeticException e) {
	            // Catch the exception and print a message
	            System.out.println("ArithmeticException caught: Division by zero is not allowed.");
	        }
	    }
	}

	