/***************************************************************
* Car.java
* This class implements copy functionality for a car.
***************************************************************/

public class Car
{
  private String make;  // car's make
  private int year;     // car's manufacturing year
  private String color; // car's primary color

  // ***3 arg constructor
  public Car(String make, int year, String color)
  {		// 'this' keyword required since parameter variable
		// names are the same as the instance variable names
    this.make = make;
    this.year = year;
    this.color = color;
  } // end 3 arg constructor

  // ***'Dummy' no-arg constructor
  public Car()
  { }
  
  //************* Mutator / Setter Methods *********************
  // Since parameter variable names are the same, 'this' required
  public void setMake(String make)
  { this.make = make;
  }

  public void setYear(int year)
  { this.year = year;
  }

  public void setColor(String color)
  { this.color = color;
  }

  //************************************************************
  // ***Notice the return type (Car object)
  // 'this' keyword optional here but makes it 
  // clearer it refers to 'this' or calling object
  public Car makeCopy()
  { Car car = new Car();

    car.make = make;	// 'this' omitted to demo it compiles/runs ok
    car.year = this.year;
    car.color = this.color;

    return car;
  } // end makeCopy

 // Another way to copy an object - pass in rather than return an object
    public void makeCopy2(Car car)
  { //Car car = new Car();
    car.make = make;	// 'this' omitted to demo it compiles/runs ok
    car.year = this.year;
    car.color = this.color;
    //return car;
  } // end makeCopy

  //************************************************************
  public void display(){ 	// 'this' is optional
    System.out.println("\tmake = " + this.make +
                       "\n\tyear = " + this.year +
					   "\n\tcolor = " + this.color);
  } // end display

  //************************************************************
  // This method tests whether two cars hold the same data.
  public boolean equals(Car otherCar)
  {
    return this.make.equals(otherCar.make)		// calls equal method in string class
		&& this.color.equals(otherCar.color)	// calls equal method in string class
		&& year == otherCar.year;	        	// 'this' omitted to demo it compiles/runs ok
  } // end equals

  //************************************************************
  public String toString(){ 	// 'this' is optional
    return("\n\tmake = " + this.make +
           "\n\tyear = " + this.year +
		   "\n\tcolor = " + this.color);
  } // end toString

} // end class Car