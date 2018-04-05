// Modified Solution 1
// added try-catch JUST around the statements that might
// generate the exception - a little messier code

import java.util.*;
import java.io.*;

public class FileIO_SOL2 {
 public static void main(String[] args)	// throws IOException 
 {
		Scanner s = new Scanner(System.in);
		Scanner inFile = null;
		//file input

	try{
		inFile = new Scanner(new File("nums.txt"));
	}	
	catch (IOException e) {
		System.out.println("Error in opening the file");
		System.out.println("Check filename and rerun program");
		System.exit(-1);	
	} //end catch IOException

	int sum = 0;
	while (inFile.hasNext()) {
		String line = inFile.nextLine();
		String[] pieces = line.split(" ");
		for (int i = 0; i < pieces.length; i++) {
		try {
				sum += Integer.parseInt(pieces[i]);
			}
		catch (NumberFormatException n) {
		System.out.println("All lines in text file must be integers.");
		System.exit(-1);
		//System.out.println ("Skipping non-numeric data " + pieces[i]);
		} //end catch NumberFormatException
			
		} // end for
	} // end while
		
	System.out.println("\nSum is: " + sum);
	inFile.close();
	//} //end try

	//System.out.println("Exiting gracefully...");
	
 } // end main
} // end FileIO_SOL2 class