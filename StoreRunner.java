import java.util.Scanner;

public class StoreRunner {
  public static void main(String[] args) {

   /*
 * creates scanner
 */
    Scanner input = new Scanner(System.in);

    /*
 * Establishes the objects. The parameters correspond to the variable values such as the item number, price, and year made.
 * Then the item details are spat into the console log.
 */
     Antiques a1 = new Antiques();
     Antiques a2 = new Antiques(2, 1700.00, 1984, "Velvet sofa");

     System.out.println(a1);
     System.out.println(a2);

    Books b1 = new Books(3, 17.99, 1603, "Hamlet", 400, "Shakespeare");
    Books b2 = new Books(4, 15.99, 1992, "The Secret History", 576, "Donna Tartt");

     System.out.println(b1);
     System.out.println(b2);

    Ceramics c1 = new Ceramics(5, 34.27, 1945, "Vase", "marble");
    Ceramics c2 = new Ceramics(6, 5.00, 1990, "Mini sculpture", "clay");

     System.out.println(c1);
     System.out.println(c2);

    /*
 * This allows for user interaction. A user types in the item number of what they want.
 * The code then prints a one-line receipt.
 */

System.out.println("\nHi, here is this week's collection catalogue. \nPlease select an item from the list above and type the corresponding item number!");
    
    int item = input.nextInt();
    if (item == 1) {
      System.out.println("Thank you for ordering a chair. Have a nice day!");
    }
        if (item == 2) {
      System.out.println("Thank you for ordering a velvet sofa. Have a nice day!");
    }
        if (item == 3) {
      System.out.println("Thank you for ordering Hamlet. Have a nice day!");
    }
     if (item == 4) {
      System.out.println("Thank you for ordering The Secret History. Have a nice day!");
    }
     if (item == 5) {
      System.out.println("Thank you for ordering a marble vase. Have a nice day!");
    }
     if (item == 6) {
      System.out.println("Thank you for ordering a clay sculpture. Have a nice day!");
    }

    /*
 * Closes scanner
 */
    input.close();
    
  }
}