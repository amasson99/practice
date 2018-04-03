import java.util.*;

public class StudentApp{
  public static void main(String[] args){

    Scanner in = new Scanner(System.in);

    Student student = new Student("John Doe", "CS", 3);

    for (int i =0; i < 3; i++){
      System.out.println("Enter in Credit Hours for course " + (i+1) + ": ");
      int hours = Integer.parseInt(in.nextLine());

      System.out.println("Enter in Grade for course " + (i+1) + ": ");
      char grade = in.nextLine().charAt(0);

      student.addInfo(hours, grade);
    }
    System.out.println(student);
  }


}
