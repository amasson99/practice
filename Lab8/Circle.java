import java.util.*;
public class Circle{
  private String color = "Blue";
  private double radius = 0;
  final private double PI = 3.14159;
  Scanner in = new Scanner(System.in);

  public void Circle(){
    color = "Red";
    radius = 1;
  }

  public void Circle(double r, String c){
    radius = r;
    color = c;
  }

  public String getColor(){
    return this.color;
  }

  public double getRadius(){
    return this.radius;
  }

  public void setColor(String co){
    this.color = co;
  }

  public void setRadius(double ra){
    this.radius = ra;
  }

  public String findArea(){
    double area = (this.radius*this.radius)*PI;
    String areaString = String.format("%.1f",area);
    return areaString;
  }

  public String toString(){
    String circle = "Color: " + this.color + "\nRadius: " + this.radius + "\nArea: " + findArea();
    return circle;
  }

  public boolean equals(Circle other){
    if(this.radius==(other.radius)){
      if (this.color.equals(other.color)){
      return true;
    }
  }
  return false;
}
}
