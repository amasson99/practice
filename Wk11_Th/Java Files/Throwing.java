// This example THROWS (generates) an exception within the method...
// Reads in two ints (handles non-integer input)
// and initially displays the 'integer' result
// of num1/num2
 
import java.util.*;

public class Throwing {
 public static void main(String[] args) {
	Scanner s = new Scanner(System.in);

	try {
		System.out.print("Enter num1: ");
		int num1 = Integer.parseInt(s.nextLine());
		System.out.print("Enter num2: ");
		int num2 = Integer.parseInt(s.nextLine());

// This method generates an exception on division by zero		
		int result = div(num1, num2);
		//double result = div(num1, num2);		// initially commented out

		System.out.println("Result is: " + result);
	} // end try
		
	catch (NumberFormatException n)
	{ System.out.println("Bad input. Integers only");
	} // end NumberFormatException


/*	
	catch (ArithmeticException a) {
		// displays passed-in string message from method below
		System.out.println(a.getMessage());
	} // end ArithmeticException
*/

/*	
// added to Java 7, if you want to perform the same action if
// either exception is thrown
// Can use to replace the catch statements above
	catch (NumberFormatException | ArithmeticException a) {
		System.out.println("Error - Exception thrown");
		System.out.println(a.getMessage());
	} // end NumberFormatException | ArithmeticException
*/

		System.out.println("End of program reached...");
	} // end main

//	public static double div(int a, int b) {	// initially commented out		
	public static int div(int a, int b) {
		// if statement initially commented out
		//if (b == 0)
			//throw new ArithmeticException("Denominator can't be zero!!!!");
		
		return a/b;
		// return (double) a/b;		// initially commented out
	} // end div
} // end class