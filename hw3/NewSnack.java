// Andrew Weekes
// CS 152
// Homework 3

package cs152.hw3;

// NewSnack parent class; implements Comparable interface for type NewSnack
public class NewSnack implements Comparable<NewSnack> {

  // class variables
  protected String name;
  protected double weightOunces = 0;

  /*
   * constructor for NewSnack class;
   * ensure that weightOunces cannot be negative
   */
  public NewSnack(String name, double weightOunces) {
    this.name = name;
    this.weightOunces = weightOunces;
    if (this.weightOunces < 0) {
      this.weightOunces = 0;
    }
  }

  // getter method for name variable
  public String getName() {
    return name;
  }

  // getter method for weightOunces variable
  public double getWeightOunces() {
    return weightOunces;
  }

  // toString method to print information for each NewSnack object
  public String toString() {
    return this.getName() + "(" + this.getWeightOunces() + ")";
  }

  /*
   * compareTo method to be used in SnackSort program.
   * Used to sort objects of the NewSnack class.
   * Sort based on name first, and if name starts with same letter,
   * sort by lowest weight to highest weight instead.
   */
  @Override
  public int compareTo(NewSnack that) {
    if (this.name.compareToIgnoreCase(that.name) < 0) {
      return -1;
    } else if (this.name.compareToIgnoreCase(that.name) > 0) {
      return 1;
    } else {
      if (this.weightOunces < that.weightOunces) {
        return -1;
      } else if (this.weightOunces > that.weightOunces) {
        return 1;
      } else {
        return 0;
      }
    }
  }
}
