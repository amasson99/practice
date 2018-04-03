import java.util.*;

public class CircleApp {

  public static void main(String [] args){

    Scanner in = new Scanner(System.in);
    Circle comparisonCircle = new Circle();
    Circle [] circleArray = new Circle[10];
    boolean sentinel = false;
    int z = 0;
    int i = 0;
    int k = 0;
    int h = 0;

    final int MAXAMOUNT = 2;
    for(z = 0; z < MAXAMOUNT; z++){
      circleArray[z] = new Circle();
    }
    for(i = 0; i < MAXAMOUNT; i++){
      System.out.println("Enter color the for circle " + (i+1));
      circleArray[i].setColor(in.nextLine());
      System.out.println("Enter the radius for circle " + (i+1));
      circleArray[i].setRadius(in.nextDouble());
    }
    while (circleArray[k]!=null){
        System.out.println(circleArray[k].toString());
        k++;
    }
    System.out.println("Enter the color for another circle: ");
    comparisonCircle.setColor(in.nextLine());
    System.out.println("Enter the radius for another circle: ");
    comparisonCircle.setRadius(in.nextDouble());

    while(circleArray[h]!=null){
      if(comparisonCircle.equals(circleArray[h])){
      }else {
        System.out.println("Entered circle DOESN'T equals a created object in the array");
        break;
      }
      if(circleArray[h+1] == null){
        System.out.println("Entered circle equals a created object in the array");
      }
      h++;
    }
  }
}
