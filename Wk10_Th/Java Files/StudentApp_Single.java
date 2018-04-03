import java.util.*;

public class StudentApp_Single
{
  public static void main(String[] args)
  { Scanner in = new Scanner(System.in);

/*
	// create a 'default' student object using no-arg constructor
	// for testing of constructor and toString method
	Student blank = new Student();
	// Display student information using toString method
	System.out.println("Result of no-arg constructor: " + blank);
*/

	// create a student object - Hardcode "John Doe", "CS", 3 (Courses)
	// Of course, better to read this info from user or a file
	Student student = new Student("John Doe", "CS", 3);

	// Read in Credit Hours / Grade for each course
	for (int i = 0; i < 3; i++) {
		System.out.print("Enter in Credit Hours for Course " + (i+1) + ": ");
		int hours = Integer.parseInt(in.nextLine());
		System.out.print("Enter in Grade for Course " + (i+1) + ": ");
		String s = in.nextLine();
		char grade = s.charAt(0);
		student.addInfo(hours, grade);
	} // end for
	
	// Display student information using toString method
		System.out.println(student);

 	} // end main
} // end class StudentApp