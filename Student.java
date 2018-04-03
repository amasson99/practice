public class Student{

  //Data properties of a student object
  private String name;
  private String major;
  private int [] hours;
  private char [] grades;
  private int pos;

  //no arg constructer
  public Student(){

  }
  //3-ard constructer
  public Student(String n, String m, int numCourses){
    name=n;
    major=m;
    hours=new int[numCourses];
    grades = new char[numCourses];
    pos = 0;
  }

  //add the info for  a course (credit hours/grades)\
  public void addInfo (int h, char g){
    if (pos < hours.length){
      hours[pos] = h;
      grades[pos] = g;
      pos++;
    } else {
      System.out.println("Course array is full");
    }
  }

  //calculate students gpa - private helper
  private  double calcGPA(){

    int totalPoints = 0;
    int totalHours = 0;

    for(int i = 0; i < pos; i++){
      totalHours += hours[i];

      int classPoints = h;
      if(grades[i]=='A')
      classPoints = 4;
      else if(grades[i]=='B')
      classPoints = 3;
      else if(grades[i]=='C')
      classPoints = 2;
      else if(grades[i]=='D')
      classPoints = 1;

      totalPoints += classPoints * hours[i];

    }
    return (totalPoints/(double)totalHours);
  }

 //return string to display Name, Mahor, gpa
 public String toString(){


   String s = "Name"+name;
   s += "\nMajor"+major;
   s += "\nGPA: "+calcGPA();

   return s;
 }//

}//end class
