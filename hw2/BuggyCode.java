package cs152.hw2;
//Andrew Weekes
//CS 152 Homework 2

import java.util.Scanner;

/**
* Some buggy code to practice methodical debugging and creating a test harness.
*
* This code has a few bugs
*
* @author Chad Williams
*
*/
public class BuggyCode {
  /** Holds the cumulative sum of calls to the add methods */
  private static int value = 0;

  /**
  * Creates an instance of the class for collecting the cumulative sum
  */
  public BuggyCode() {

  }

  /**
  * Returns the sum of all numbers that have been added so far
  *
  * @return Cumulative value
  */
  public int getCumulativeValue() {
    return value;
  }

  /**
  * Adds the passed value to the sum
  *
  * @param value New value to be added
  */
  public void add(int value) {       //changed return type from void to int, change to static
    //need to add each value entered to cumulative sum value defined in BuggyCode class variable
    BuggyCode.value += value;
  }

  /**
  * Adds each int in the array to the cumulative sum
  *
  * @param values New values to be added
  */
  public void addArray(int[] values) {
    for (int i = 0; i < values.length; i++) {
      add(values[i]);
    }
  }

  /**
  * Method takes a string with integers separated by spaces and returns an int array Ex. "1 2 3"
  * would return [1,2,3]
  *
  * @param intArrayString Integers separated by spaces
  * @return int array of passed values
  */
  public static int[] getIntArrayFromString(String intArrayString) {
    String[] intParts = intArrayString.split(" ");
    int[] returnArray = new int[intParts.length];
    int index = 0;
    while (index < intParts.length) {
      returnArray[index] = Integer.parseInt(intParts[index]);
      index++;
    }
    return returnArray;
  }

  /**
  * @param args
  */
  public static void main(String[] args) {
    // declare and initialize variables
    Scanner scan = new Scanner(System.in);
    String inputString = "";

    // Create instance and add numbers entered by user
    BuggyCode code = new BuggyCode();

    System.out.println("Enter first number to add: ");
    int numberEntered = Integer.parseInt(scan.nextLine());
    System.out.println("First number entered is: " + numberEntered);        //print statement to debug
    code.add(numberEntered);

    System.out.println("Enter second number to add: ");
    numberEntered = Integer.parseInt(scan.nextLine());
    System.out.println("Second number entered is: " + numberEntered);       //print statement to debug
    code.add(numberEntered);

    System.out.println("Total of the values entered is: " + code.getCumulativeValue());       //print statement to debug




    System.out.print("Enter a set of numbers each separated by a space: ");
    inputString = scan.nextLine();
    int[] intArray = BuggyCode.getIntArrayFromString(inputString);
    System.out.print("Numbers to be added: ");                              //print statement to debug
    for (int index = 0; index < intArray.length; index++) {             //for loop to calculate and print current values to be added
      int number = intArray[index];
      System.out.print(number + " ");
    }
    System.out.print("\n");
    code.addArray(intArray);


    System.out.println("Total of the values entered is: " + code.getCumulativeValue());
  }

}
