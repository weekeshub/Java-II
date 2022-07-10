package cs152.hw4;

// Andrew Weekes
// CS 152
// Homework 4

import java.io.IOException;
import java.util.Scanner;

public class Keyboard {

  // getInt() method with no prompt
  public static int getInt() throws NoDigitsException, IOException {

    // get input from user
    Scanner scan = new Scanner(System.in);
    String input = "";
    input = scan.nextLine();

    // boolean to check if digits are found
    boolean digits = false;

    // string to hold final input after non-digit characters are removed
    String digitsInput = "";

    // check if input contains digits, remove all characters except digits
    for (int index = 0; index < input.length(); index++) {
      if (NoDigitsException.DIGITS.contains(Character.toString(input.charAt(index)))) {
        digits = true;

        // add only digits to final input
        digitsInput += input.charAt(index);
      }
    }

    // if no digits are found, throw NoDigitsException
    if (digits == false) {
      System.out.print("That's a bad message.");
      throw new NoDigitsException(input);
    }

    // parse string to int and return
    return Integer.parseInt(digitsInput);

  }

  // getDouble() method with no prompt
  public static double getDouble() throws NoDigitsException, IOException {

    // get input from user
    Scanner scan = new Scanner(System.in);
    String input = "";
    input = scan.nextLine();

    // boolean to check if digits are found
    boolean digits = false;

    // string to hold final input after non-digit characters are removed
    String digitsInput = "";

    // decimal counter
    int count = 0;

    // check if input contains digits and decimals. If more than one decimal is found, discard the
    // rest.
    // Add a 0 after first decimal place if no integers exist after it.
    // discard anything except integers and first decimal place
    for (int index = 0; index < input.length(); index++) {
      if (NoDigitsException.DIGITS.contains(Character.toString(input.charAt(index)))) {
        digits = true;

        // add only digits to final input
        digitsInput += input.charAt(index);
      }

      // remove excess decimals if more than one is found
      if (count < 1) {
        if (input.charAt(index) == '.') {

          // add decimal point to final input
          digitsInput += "" + input.charAt(index);
          count++;
        }
      }
    }

    // if no digits are found, throw NoDigitsException
    if (digits == false) {
      System.out.print("That's a bad message.");
      throw new NoDigitsException(input);
    }

    // parse string to double and return
    return Double.parseDouble(digitsInput);

  }

  // getInt() method with prompt
  public static int getInt(String prompt) throws NoDigitsException, IOException {

    // print prompt
    System.out.print(prompt);

    // get input from user
    Scanner scan = new Scanner(System.in);
    String input = "";
    input = scan.nextLine();

    // boolean to check if digits are found
    boolean digits = false;

    // variable to hold final input after non-digit characters are removed
    String digitsInput = "";

    // check to see if input contains digits, discard anything except digits
    for (int index = 0; index < input.length(); index++) {
      if (NoDigitsException.DIGITS.contains(Character.toString(input.charAt(index)))) {
        digits = true;

        // add only digits to final input
        digitsInput += input.charAt(index);
      }
    }

    // if no digits are found, throw NoDigitsException
    if (digits == false) {
      System.out.print("That's a bad message.");
      throw new NoDigitsException(input);
    }

    // return string to int and return
    return Integer.parseInt(digitsInput);

  }

  // getDouble() method with prompt
  public static double getDouble(String prompt) throws NoDigitsException, IOException {

    // print prompt
    System.out.print(prompt);

    // get input from user
    Scanner scan = new Scanner(System.in);
    String input = "";
    input = scan.nextLine();

    // boolean to check if digits are found
    boolean digits = false;

    // variable to hold final input after non-digit characters are removed
    String digitsInput = "";

    // decimal counter
    int count = 0;

    // check to see if input contains digits
    for (int index = 0; index < input.length(); index++) {
      if (NoDigitsException.DIGITS.contains(Character.toString(input.charAt(index)))) {
        digits = true;

        // add only digits to final input
        digitsInput += input.charAt(index);
      }
      // if input contains more than one decimal place, discard after first one is found
      if (count < 1) {
        if (input.charAt(index) == '.') {

          // add decimal point to final input
          digitsInput += "" + input.charAt(index);

          // increment decimal counter
          count++;
        }
      }
    }

    // if no digits are found, throw NoDigitsException
    if (digits == false) {
      System.out.print("That's a bad message.");
      throw new NoDigitsException(input);
    }

    // parse string to double and return
    return Double.parseDouble(digitsInput);

  }

}
