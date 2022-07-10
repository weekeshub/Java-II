package cs152.hw1;

/*
* @author Jeff Blankenship
* This tests the methods of the DigitCounter class.
*/

public class DigitCountTester {

  /*
  * Tests for correct results from the DigitCounter.digits(String...). True: actual matches
  * expected False: actual different than expected
  *
  * @param testNum The STRING variable to be tested
  * @param expDigits The expected number of digits to be found in testDouble
  */

  private static String testDigits(String testNum, int expDigits) {
    boolean resultBool = DigitCounter.digits(testNum) == expDigits;
    String result = passFail(resultBool);
    return result;
  }

  /*
  * Tests for correct results from the DigitCounter.digits(double...). True: actual matches
  * expected False: actual different than expected
  *
  * @param testNum The DOUBLE variable to be tested
  * @param expDigits The expected number of digits to be found in testDouble
  */
  private static String testDigits(double testNum, int expDigits) {
    boolean resultBool = DigitCounter.digits(testNum) == expDigits;
    String result = passFail(resultBool);
    return result;
  }

  /*
  * Tests for correct results from the DigitCounter.digits(float...). True: actual matches expected
  * False: actual different than expected
  *
  * @param testNum The FLOAT variable to be tested
  * @param expDigits The expected number of digits to be found in testDouble
  */
  private static String testDigits(float testNum, int expDigits) {
    boolean resultBool = DigitCounter.digits(testNum) == expDigits;
    String result = passFail(resultBool);
    return result;
  }



  /*
  * Tests for correct results from the DigitCounter.digits(int...). True: actual matches expected
  * False: actual different than expected
  *
  * @param testNum The INTEGER variable to be tested
  * @param expDigits The expected number of digits to be found in testDouble
  */
  private static String testDigits(int testNum, int expDigits) {
    boolean resultBool = DigitCounter.digits(testNum) == expDigits;
    String result = passFail(resultBool);
    return result;
  }

  /*
  * Tests for correct results from the DigitCounter class. True: actual matches expected False:
  * actual different than expected
  *
  * @param testNum The DOUBLE variable to be tested
  * @param expDigits The expected number of DECIMALS to be found in testDouble
  *
  */
  private static String testDecimals(double testNum, int expDecimals) {
    boolean resultBool = DigitCounter.decimals(testNum) == expDecimals;
    String result = passFail(resultBool);
    return result;
  }

  /*
  * Tests for correct results from the DigitCounter class. True: actual matches expected False:
  * actual different than expected
  *
  * @param testNum The FLOAT variable to be tested
  * @param expDigits The expected number of DECIMALS to be found in testDouble
  *
  */
  private static String testDecimals(float testNum, int expDecimals) {
    boolean resultBool = DigitCounter.decimals(testNum) == expDecimals;
    String result = passFail(resultBool);
    return result;
  }

  /*
  * Tests for correct results from the DigitCounter class. True: actual matches expected False:
  * actual different than expected
  *
  * @param testNum The INT variable to be tested
  * @param expDigits The expected number of DECIMALS to be found in testDouble
  *
  */
  private static String testDecimals(int testNum, int expDecimals) {
    boolean resultBool = DigitCounter.decimals(testNum) == expDecimals;
    String result = passFail(resultBool);
    return result;
  }

  /*
  * Tests for correct results from the DigitCounter class. True: actual matches expected False:
  * actual different than expected
  *
  * @param testNum The STRING variable to be tested
  * @param expDigits The expected number of DECIMALS to be found in testDouble
  *
  */
  private static String testDecimals(String testNum, int expDecimals) {
    boolean resultBool = DigitCounter.decimals(testNum) == expDecimals;
    String result = passFail(resultBool);
    return result;
  }



  /*
  * Returns String "PASS" or "FAIL" based on the value of testResult. This is a support method to
  * avoid repeating the same if statement many time.
  *
  * @param testResult boolean to be converted to PASS/FAIL
  */
  private static String passFail(boolean testResult) {
    if (testResult) {
      return "PASS";
    } else {
      return "FAIL";
    }
  }



  /*
  * Test all methods by calling each and comparing the result to correct answers.
  */
  public static void main(String[] args) {

    // test double digit count
    System.out.println("Double   digit test 00123.4500 \t\t" + testDigits(00123.45000d, 3));
    // test float digit count
    System.out.println("float    digit test 0012.34500 \t\t" + testDigits(0012.345000f, 2));
    // test int count
    System.out.println("int      digit test 123 \t\t" + testDigits(123, 3));
    // test String count
    System.out.println("String   digit test 1234.567 \t\t" + testDigits("1234.567", 4));

    // test double decimal count
    System.out.println("Double decimal test 00123.4500 \t\t" + testDecimals(00123.45000d, 2));
    // test float decimal count
    System.out.println("float  decimal test 0012.345000\t\t" + testDecimals(0012.345000f, 3));
    // test int count
    System.out.println("int    decimal test 123 \t\t" + testDecimals(123, 0));
    // test String count
    System.out.println("String decimal test 1234.567 \t\t" + testDecimals("1234.567", 3));

  }

}
