public class Books extends Antiques {
  /*
 * Instance variables
 */
   private int pages;
   private String author;

    /*
 * no argument constructor. provides base values for variables
 */
  public Books() {
    super();
    this.pages = 100;
    this.author = "Donna Tartt";
  }

    /*
 * constructor w an argument
 */
  public Books(int number, double price, int yearMade, String name, int pages, String author) {
    super(number, price, yearMade, name);
    this.pages = pages;
    this.author = author;
  }

  /*
 * accessor and mutator methods
 */
public int getPages(){
  return pages;
}

public void setPages(int pages) {
  this.pages = pages;
}

  public String getAuthor(){
  return author;
}

public void setAuthor(String author) {
  this.author = author;
}
    /*
 * To string. This prints out something in the console later.
 * The super.toString reduces code by making it so we don't have to rewrite the line from Antiques.java
 */
  public String toString() {
    return super.toString() + "\nNumber of Pages: " + pages + "\nAuthor: " + author;
  }
}