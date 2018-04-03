/**************************************************************
* CarApp.java
* This class is a demonstration driver for the Car class.
* Uses Arrays of Car objects
**************************************************************/

public class CarApp_Arrays
{
  public static void main(String[] args)
  { Car [ ] carArray = new Car [10];

// instantiate 2 car objects in the array - Rest are NULL!
    carArray[0] = new Car("Audi", 1998, "green");
    carArray[1] = new Car("Ford", 2010, "blue");

// Output Contents of Array using a 'for' loop
	System.out.println("\nOutput using a 'for' loop...");
	for (int i = 0; i < carArray.length; i++)
		System.out.println("\nCar " + (i+1) + ": " + carArray[i]);

/*	
// Output MEANINGFUL Contents of Array using a 'while' loop
// since not ALL objects are created 
	System.out.println("\nOutput of the 'while' loop...");
	int i = 0;
	while (carArray[i] != null) {
		System.out.println("\nCar " + (i+1) + ": " + carArray[i]);
		i++;
	 } // end while
*/
  } // end main
} // end class CarApp