package cs152.hw1;
// Andrew Weekes
// CS 152-02
// Homework 1

public class DigitCounter {

  // digits method that accepts String parameter
  public static int digits(String testNum) {
    int countDigits = 0;
    int index = 0;
    char currentChar;
    while ((index < testNum.length()) && (testNum.charAt(index) != '.')) {
      currentChar = testNum.charAt(index);
      if (Character.isDigit(currentChar) == true) {
        countDigits++;
        index++;
      } else {
        System.out.print("Not a string of numbers.");
      }
    }
    return countDigits;
  }

  // digits method that accepts double parameter
  public static int digits(double testNum) {
    String testNum2 = String.valueOf(testNum);
    return digits(String.valueOf(testNum));
  }

  // digits method that accepts float parameter
  public static int digits(float testNum) {
    String testNum2 = String.valueOf(testNum);
    return digits(String.valueOf(testNum));
  }

  // digits method that accepts integer parameter
  public static int digits(int testNum) {
    int testNum2 = digits(String.valueOf(testNum));
    return testNum2;
  }


  // decimals method that accepts String parameter
  public static int decimals(String testNum) {
    int decimalPlace = testNum.indexOf('.');
    int countDecimals = 0;
    int i = 0;
    for (i = decimalPlace; i < testNum.length(); i++) {
      countDecimals++;
    }
    return countDecimals - 1;
  }

  // decimals method that accepts double parameter
  public static int decimals(double testNum) {
    String decimalPlace2 = String.valueOf(testNum);
    return decimals(String.valueOf(testNum));
  }

  // decimals method that accepts float parameter
  public static int decimals(float testNum) {
    String decimalPlace2 = String.valueOf(testNum);
    return decimals(String.valueOf(testNum));
  }

  // decimals method that accepts integer parameter
  public static int decimals(int testNum) {
    int countDecimals = 0;
    String testNum2 = String.valueOf(testNum);
    if (testNum == '.') {
      countDecimals++;
    } else {
      return 0;
    }
    System.out.print(countDecimals);
    return Integer.parseInt(testNum2);
  }


  // input to test with DigitCountTester class
  public static void main(String[] args) {
    DigitCounter.digits("12345.2345");
    DigitCounter.digits(1232131.000002d);
    DigitCounter.digits(123131.234562f);
    DigitCounter.digits(2873495);
    DigitCounter.decimals("12345.2345");
    DigitCounter.decimals(1232131.000002d);
    DigitCounter.decimals(1.234562f);
    DigitCounter.decimals(2873495);
  }

}
