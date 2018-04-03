import java.util.*;

public class StudentApp_Arrays
{
  public static void main(String[] args)
  { Scanner in = new Scanner(System.in);

		System.out.print("How many students to you wish to process? ");
		int numStudents = Integer.parseInt(in.nextLine());
		Student [ ] student = new Student[numStudents];

	// Read in student info then course info for each course
	for (int i = 0; i < numStudents; i++) {
		System.out.print("Enter in Student name: ");
		String name = in.nextLine();
		System.out.print("Enter in major: ");
		String major = in.nextLine();
		System.out.print("Enter in number of courses: ");
		int courses = Integer.parseInt(in.nextLine());

		// instantiate Student object!
		student[i] = new Student(name, major, courses);
		
		for (int j = 0; j < courses; j++) { 
			System.out.print("Enter in Credit Hours for Course " + (j+1) + ": ");
			int hours = Integer.parseInt(in.nextLine());
			System.out.print("Enter in Grade for Course " + (j+1) + ": ");
			String s = in.nextLine();
			char grade = s.charAt(0);
			student[i].addInfo(hours, grade);
		} // end for - course info

	} // end for - student info
	
	// Display student information using toString method
	for (int i = 0; i < numStudents; i++) 
		System.out.println(student[i]);

 	} // end main
} // end class StudentApp_Arrays