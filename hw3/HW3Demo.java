package cs152.hw3;

/*
* @ author Jeff Blankenship
*/

import java.util.Arrays;

public class HW3Demo {
  public static void main(String[] args) {
    Integer[] numbers = {4, 2, 9, 1, 8};
    SnackSort.snackSort(numbers);
    System.out.println(Arrays.toString(numbers));

    NewSnack snack = new NewSnack("Ice Cream", 12.0);
    Chip chip1 = new Chip("Corn Chip", 4.0, false);
    Chip chip2 = new Chip("Corn Chip", 1.0, true);
    SnowCone snowcone = new SnowCone("Mr.Freeze", 8.5, "Grape");
    System.out.println(snack);
    System.out.println(chip1);
    System.out.println(chip2);
    System.out.println(snowcone);

    NewSnack[] snacks = {snack, chip1, chip2, snowcone};
    SnackSort.snackSort(snacks);
    System.out.println(Arrays.toString(snacks));

    String[] pets = {"dog", "cat", "goldfish"};
    SnackSort.snackSort(pets);
  }
}
