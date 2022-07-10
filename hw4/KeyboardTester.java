package cs152.hw4;

// Andrew Weekes
// CS 152
// Homework 4

import java.io.IOException;


// Write a test class to verify your Keyboard class operates correctly by asking the user for ints
// and doubles using both the prompted
// and non-prompted versions(provide a prompt as needed before calling the method).

public class KeyboardTester {

  public static void main(String[] args) throws NoDigitsException, IOException {

    // exception counter
    int count = 0;

    // continue to ask for numbers until two NoDigitsExceptions have been thrown. Exit when
    // the second exception is thrown
    while (count < 2) {

      try {

        // getInt() with no prompt
        System.out.println("Enter an integer: ");
        System.out.println(Keyboard.getInt() + "\n");

        // getInt() with prompt
        System.out.println(Keyboard.getInt("\nEnter an integer: ") + "\n");

        // getDouble() with no prompt
        System.out.println("\nEnter a double: ");
        System.out.println(Keyboard.getDouble() + "\n");

        // getDouble() with prompt
        System.out.println(Keyboard.getDouble("\nEnter a double: ") + "\n");

        // catch any NoDigitsException and print exception message
      } catch (NoDigitsException e) {
        System.out.print(e.getMessage() + "\n");

        // when exception is caught, increment count
        count++;

      }

    }

  }

}
