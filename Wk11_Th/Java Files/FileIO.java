import java.util.*;
import java.io.*;

public class FileIO {
 public static void main(String[] args) throws IOException
 {
		Scanner s = new Scanner(System.in);
		
		//file input
		Scanner inFile = new Scanner(new File("nums.txt"));
		int sum = 0;
		while (inFile.hasNext()) {
			String line = inFile.nextLine();
			String[] pieces = line.split(" ");
			for (int i = 0; i < pieces.length; i++) {
				sum += Integer.parseInt(pieces[i]);
			} // end for
		} // end while
		
		System.out.println("Sum is: " + sum);
		inFile.close();

 } // end main
} // end FileIO class