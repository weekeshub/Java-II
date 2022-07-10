// Andrew Weekes
// CS 152
// Homework 3

package cs152.hw3;

public class SnackSort {

  // snackSort method used to sort objects of type Comparable
  public static void snackSort(Comparable[] array) {

    /*
     * define types of arrays accepted as parameters in Comparable type;
     * we want array types of int and NewSnack
     */
    NewSnack[] snackArray = new NewSnack[0];
    Integer[] intArray = new Integer[0];

    // ensure that no types of arrays will be accepted besides int and NewSnack
    if (array.getClass().equals(snackArray.getClass())
        || array.getClass().equals(intArray.getClass())) {
      // go ahead and sort
    } else {
      System.out.println("Unsupported class, do not sort.");
      return;
    }
    // at this point, we know array is of type NewSnack or Integers

    // insertion sort for int and NewSnack types
    int inner = 0;
    int outer = 0;

    // iterate from 0 --> n
    while (outer < array.length) {
      inner = outer;
      // compare current index values to previous index values
      while (inner >= 1 && array[inner - 1].compareTo(array[inner]) >= 1) {
        // insert current index value into correct position to sort
        Comparable temp = array[inner - 1];
        array[inner - 1] = array[inner];
        array[inner] = temp;
        inner--;
      }
      outer++;
      // print current sorted array; eventually prints completed sorted array
      for (int index = 0; index < outer; index++) {
        System.out.print(array[index] + " ");
      }
      System.out.print("\n");
    }
  }

}
