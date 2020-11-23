/*
* The EnergyFormula program implements an application that
* determines the energy released from a mass which the user
* inputs.
*
* @author  Ben Whitten
* @version 1.0
* @since   2020-11-23 
*/

import java.lang.Math;
import java.util.Scanner;  // Import the Scanner class

public class EnergyFormula {
  /**
   * This class is what calculates the energy released.
   */
  public static void main(String[] args) {
    //Constant for the speed of light.
    final double speedOfLight = 299800000;

    try {
      // Create a Scanner object
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter the mass(kg) of the object:");

      // Read user input (double = decimal number)
      double mass = scan.nextDouble();

      //Closing Scanner after use.
      scan.close();

      // Calculates the energy released.
      double energy = (mass * Math.pow(speedOfLight, 2));

      // Prints out the answer.
      System.out.println();
      System.out.println();
      System.out.println("The object would release:");
      System.out.println(energy + " joules of energy.");

    // Catches "bob" and tells you it is invalid.
    } catch (Exception e) {
      System.out.println();
      System.out.println();
      System.out.println("You did not input a valid mass.");
    }
  }
}
