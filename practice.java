import java.util.*;
public class practice{
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);

      String name;
      String input;
      int age = 0;

      System.out.print("Enter your name: ");
      name = in.nextLine();

      System.out.print("How old are you? ");
      input = in.nextLine();
      age = Integer.parseInt(input);

      System.out.println("Hello, " + name + ". You will be " + (age + 1) + " on your next birthday");

    in.close();
  }
}
