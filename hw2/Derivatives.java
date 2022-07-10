package cs152.hw2;
// Andrew Weekes
// CS 152 Homework 2

import java.util.Scanner;

import cs152.hw1.DigitCounter;

import java.text.DecimalFormat;

public class Derivatives {

  // include a method quadratic(a,b,c,x) which returns f(x).
  public static double quadratic(double a, double b, double c, double x) {
    return (a * (Math.pow(x, 2.0))) + (b * x) + c;
  }

  // Include a method derivative(a,b,c,x,deltaX) which returns f′(x).
  public static double derivative(double a, double b, double c, double x, double deltaX) {
    double t = 0;
    double u = 0;
    double v = 0;

    // f(x)
    u = Derivatives.quadratic(a, b, c, x);

    // f(x+deltaX)
    t = Derivatives.quadratic(a, b, c, (x + deltaX));

    // calculate f'(x) by doing (f(x + deltaX) - f(x)) / deltaX
    v = ((t - u) / deltaX);
    return v;

  }



  public static void main(String[] args) {

    System.out.println("Enter your equation and x value in the form of f(x) = ax^2 + bx + c");

    // obtain user input for tolerance
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter number for tolerance: ");
    double tolerance = scan.nextDouble();

    // obtain user input for 'a'
    Scanner a = new Scanner(System.in);
    System.out.print("a: ");
    double varA = a.nextDouble();

    // obtain user input for 'b'
    Scanner b = new Scanner(System.in);
    System.out.print("b: ");
    double varB = b.nextDouble();

    // obtain user input for 'c'
    Scanner c = new Scanner(System.in);
    System.out.print("c: ");
    double varC = c.nextDouble();

    // obtain user input for 'x'
    Scanner x = new Scanner(System.in);
    System.out.print("x: ");
    double varX = x.nextDouble();


    /*
     * Create a loop in your main method that calls derivative(...) with smaller numbers for deltaX
     * until the difference between two increments is less than the tolerance. Start with a deltaX
     * of 1.0 and reduce it by 10% each loop.
     */
    double deltaX = 1.0;
    double slope1 = 0;
    double slope2 = 0;
    double difference = 1000;
    while (tolerance < difference) {
      slope1 = Derivatives.derivative(varA, varB, varC, varX, deltaX);
      slope2 = Derivatives.derivative(varA, varB, varC, varX, (0.9 * deltaX));
      /*
       * absolute value of difference to ensure that difference does not start smaller than
       * tolerance if negative
       */
      difference = Math.abs(slope1 - slope2);
      if (difference < tolerance) {
        break;
      } else {
        deltaX = (0.9 * deltaX);
      }
    }

    /*
     * Report your final derivative(...deltaX) rounded off to the same number of decimals as the
     * user provided for tolerance.
     */
    double finalDerivative = slope2;
    // call DigitCounter class decimals method
    int toleranceDecimals = DigitCounter.decimals(tolerance);
    System.out.println("Number of decimals places in tolerance: " + toleranceDecimals);
    // call DecimalFormat class to format final derivative
    DecimalFormat format = new DecimalFormat();
    format.setMaximumFractionDigits(toleranceDecimals);
    System.out.print("Final derivative is: " + format.format(finalDerivative));

  }

}
