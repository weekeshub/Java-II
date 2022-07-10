package cs152.hw1;

/*
* @author Jeff Blankenship
*/

public class TwoDArrayTester {

  public static void main(String[] args) {
    // TODO Auto-generated method stub

    // test array for use in print methods
    final double[][] testArray1 = {{10.0, 11.0, 12.0}, {10.1, 11.1, 12.1}, {10.2, 11.2, 12.2},
        {10.3, 11.3, 12.3}, {10.4, 11.4, 12.4}};

    // call each TwoDArray print method. Expected results
    // can be found at github.com/JeffBship/TwoDArrayTester
    System.out.println("[col][row] with [0][0] at Top Left");
    TwoDArray.printTL(testArray1);
    System.out.println("[col][row] with [0][0] at Top Right");
    TwoDArray.printTR(testArray1);
    System.out.println("\n[row][col] with [0][0] at Bottom Left");
    TwoDArray.printBL(testArray1);
    System.out.println("\n[row][col] with [0][0] at Bottom Right");
    TwoDArray.printBR(testArray1);

  }

}
