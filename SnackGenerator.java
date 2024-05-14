/*
 * This program stores a list of snacks we have by category.
 * The user will be able to choose from a category such as chips, candy, etc. After a
 * choice is made, a random snack from the selected category will be printed on the screen. 
 * Author: Levi Ball
 * Created: 9/11/2023
 * Last Modified:
 * email: levi.ball@qsibanking.com
 */

import java.util.Random;
import java.util.Scanner;

public class SnackGenerator {

  public static void main(String[] args) {
    String[] chips = {
      "Nacho Cheese Doritos",
      "Lays BBQ",
      "Cool Ranch Doritos",
      "Chili Cheese Fritos",
      "Lays Sour Cream & Oninon",
      "Cheetos",
      "Cheetos Puffs",
      "Funions",
      "Honey BBQ Twists Fritos",
      "Cheddar Sour cream & Onion Ruffles",
      "Sour Cream & Onion Ruffles",
      "Doritos Spicy Nacho",
    };
    String[] candy = { "blue", "green apple", "cherry" };
    String[] chocolate = {
      "Almond Joy",
      "Milk Duds",
      "KitKat",
      "Reeces",
      "Hersheys",
    };
    Scanner keyboard = new Scanner(System.in);
    System.out.println("\nWelcome to the Snack Generator!");
    System.out.println("\nPlease select from the following categories: ");
    System.out.println("Enter 1 for Chips");
    System.out.println("Enter 2 for Candy");
    System.out.println("Enter 3 for Chocolate");
    System.out.println("Enter 0 to exit");

    int choice = -1; 

    while (choice != 0) {
      choice = keyboard.nextInt();

      if (choice == 1) {
        int randomIndex = (int) (Math.random() * chips.length);
        System.out.println("Random chip pick: " + chips[randomIndex]);
      } else if (choice == 2) {
        int randomIndex = (int) (Math.random() * candy.length);
        System.out.println("Random candy pick: " + candy[randomIndex]);
      } else if (choice == 3) {
        int randomIndex = (int) (Math.random() * chocolate.length);
        System.out.println("Random chocolate pick: " + chocolate[randomIndex]);
      } else if (choice != 0) {
        System.out.println("Error: Invalid pick, please try again...");
      }

      System.out.println("Please enter your next choice or press 0 to exit.");
    }

    System.out.println("Goodbye!");
  } //end main
} //end of class
