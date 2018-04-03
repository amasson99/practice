/**************************************************************
* CarApp.java
* This class is a demonstration driver for the Car class.
**************************************************************/

public class CarApp
{
  public static void main(String[] args)
  {
    Car nathanCar = new Car("Audi", 1998, "green");
    Car nickCar = nathanCar;
//    Car nickCar = nathanCar.makeCopy();
    
// Calling makeCopy2 method	
//	Car nickCar = new Car();
//	nathanCar.makeCopy2(nickCar);

    System.out.println("\nNathan's Car:");
    nathanCar.display();

    System.out.println("\nNick's Car:");
    nickCar.display();

	System.out.println("\nChange year on Nick's Car...");
 	nickCar.setYear(2000);

System.out.println ("\nDisplay using the 'display' method...");
    System.out.println("Nathan's Car:");
    nathanCar.display();

	System.out.println("\nNick's Car:");
    nickCar.display();

System.out.println ("\nDisplay using the 'toString' method...");
	// calling method EXPLICITLY
    System.out.println("Nathan's Car:" + nathanCar.toString());

	// calling method IMPLICITLY
	System.out.println("\nNick's Car:" + nickCar);
	
/*
    if (nathanCar.equals(nickCar))
    {
      System.out.println("\nCars have identical features.");
    }
    else {
      System.out.println("\nCars do NOT have identical features.");
    }
*/

	} // end main
} // end class CarApp