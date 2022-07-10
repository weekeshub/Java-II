package cs152.hw4;

// Andrew Weekes
// CS 152
// Homework 4

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class NoDigitsException extends Exception {

  // constant containing all possible digits
  public static final String DIGITS = "0123456789";

  // exception constructor
  public NoDigitsException(String message) throws IOException {

    // this exception should include the message "no digits found".
    super("\nNo digits found.\n");

    // whenever an exception of this type is created, add an entry to a log file
    // "NoDigitsException log.txt". Include time/date stamp and the string entered
    // that caused the exception.
    File file = new File("NoDigitsException log.txt");
    FileWriter fw = new FileWriter(file, true);
    String timeStamp = "";
    Date date = new Date();
    timeStamp = date.toString();
    fw.write("\n" + timeStamp);

    StackTraceElement[] stack = this.getStackTrace();
    for (int index = 0; index < stack.length; index++) {
      fw.write("\n" + stack[index].toString());
    }

    fw.write("\n" + message + " contains no digits." + "\n");

    // close file
    fw.close();

  }

}
