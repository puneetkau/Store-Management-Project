public class Antiques {
/*
 * Instance variables
 */
private int number;
private double price;
private int yearMade;
private String name;

  /*
 * no argument constructor. provides base values for variables
 */

  public Antiques(){
    this(1, 175.99, 1977, "chair");
  }

  /*
 * constructor w an argument
 */
  public Antiques(int number, double price, int yearMade, String name) {
    this.number = number;
   this.price = price;
   this.yearMade = yearMade;
   this.name = name;
  }

/*
 * accessor and mutator methods
 */
public double getPrice(){
  return price;
}

public void setPrice(double price) {
  this.price = price;
}

  public int getYearMade(){
  return yearMade;
}

public void setYearMade(int yearMade) {
  this.yearMade = yearMade;
}

  public String getName(){
  return name;
}

public void setName(String name) {
  this.name = name;
}

    public int getNumber(){
  return number;
}

public void setNumber(int number) {
  this.number = number;
}
  
  /*
 * To string. This prints out something in the console later.
 */
public String toString() {
  return "\nItem Number: " + number + "\nPrice: " + price + "\nYear Manufactured: " + yearMade +"\nItem Name: " + name;
}
}