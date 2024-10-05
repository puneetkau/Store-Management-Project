public class Ceramics extends Antiques {
  /*
 * Instance variables
 */
   private String material;

    /*
 * no argument constructor. provides base values for variables
 */
  public Ceramics() {
    super();
    this.material = "Wood";
  }

    /*
 * constructor w an argument
 */
  public Ceramics(int number, double price, int yearMade, String name, String material) {
    super(number, price, yearMade, name);
    this.material = material;
  }
  
/*
 * accessor and mutator methods
 */
  public String getMaterial(){
  return material;
}

public void setMaterial(String material) {
  this.material = material;
}
      /*
 * To string. This prints out something in the console later.
 * The super.toString reduces code by making it so we don't have to rewrite the line from Antiques.java
 */
    public String toString() {
    return super.toString() + "\nMaterial: " + material;
  }
}