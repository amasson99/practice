public class Student {

	// Data Properties of a Student Object
	private String name;
	private String major;
	private int[] hours;
	private char[] grades;
	private int pos;		// current position in hours[] & grade[]
	
	// no arg constructor
	public Student () 
	{
		// dummy constructor
	}
	
	// 3-arg constructor - name, major, number of courses
	public Student(String n, String m, int numCourses) {
		name = n;
		major = m;
		hours = new int[numCourses];
		grades = new char[numCourses];
		pos = 0;
	}
	
//*********************************************************	
	//add the info for a course (credit hours / grade)
	public void addInfo(int h, char g) {
		if (pos < hours.length) 
		{	hours[pos] = h;
			grades[pos] = g;
			pos++;
		}
		else
			System.out.println("Max number of classes entered...");
	} // end addInfo
	
//*********************************************************	
	//***Private method ... only called from within class
	private double calcGPA() {
		int totalPoints = 0;
		int totalHours = 0;
		
		for (int i = 0; i < pos; i++) {
			totalHours += hours[i];
			int classPoints = 0;
			if (grades[i] == 'A') classPoints = 4;
				else if (grades[i] == 'B') classPoints = 3;
					else if (grades[i] == 'C') classPoints = 2;
						else if (grades[i] == 'D') classPoints = 1;
			
			totalPoints += hours[i]*classPoints;
		} // end for
		
		return totalPoints/(double)totalHours;
	} // end calcGPA
	
//*********************************************************	
	// Display Name, major, and GPA
	public String toString() {
		return ("\nName: " + name +
				"\nMajor: " + major +
				"\nGPA: " + calcGPA());
		} // end toString

} //end Student class