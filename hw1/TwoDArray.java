package cs152.hw1;
// Andrew Weekes
// CS 152-02
// Homework 1

public class TwoDArray {

  // method to print with origin at Top Left
  public static double printTL(double[][] array) {

    System.out.println("\nOrigin at Top Left");
    for (int outer = 0; outer < array.length; outer++) {
      for (int inner = 0; inner < array[outer].length; inner++) {
        System.out.print(array[outer][inner] + " ");
      }
      System.out.println();
    }
    System.out.println();
    return 0;

  }

  // method to print with origin at Top Right
  public static double printTR(double[][] array) {

    System.out.println("\nOrigin at Top Right");
    for (int outer = 0; outer < array.length; outer++) {
      for (int inner = array[outer].length - 1; inner >= 0; inner--) {
        System.out.print(array[outer][inner] + " ");
      }
      System.out.println();
    }
    return 0;

  }

  // method to print with origin at Bottom Left
  public static double printBL(double[][] array) {

    System.out.println("\nOrigin at Bottom Left");
    for (int inner = array.length - 1; inner >= 0; inner--) {
      for (int outer = 0; outer < array[inner].length; outer++) {
        System.out.print(array[inner][outer] + " ");
      }
      System.out.println();
    }
    return 0;

  }

  // method to print with origin at Bottom Right
  public static double printBR(double[][] array) {

    System.out.println("\nOrigin at Bottom Right");
    for (int inner = array.length - 1; inner >= 0; inner--) {
      for (int outer = array[inner].length - 1; outer >= 0; outer--) {
        System.out.print(array[inner][outer] + " ");
      }
      System.out.println();
    }
    return 0;

  }


}
