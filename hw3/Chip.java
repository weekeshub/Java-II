// Andrew Weekes
// CS 152
// Homework 3

package cs152.hw3;

// Chip child class of NewSnack parent class
public class Chip extends NewSnack {

  // class variables
  private boolean hasGluten = true;

  /*
   * constructor for Chip child class;
   * call name and weightOunces variables from NewSnack parent class
   */
  public Chip(String name, double weightOunces, boolean hasGluten) {
    super(name, weightOunces);
    this.hasGluten = hasGluten;
  }

  // method to return whether Chip object contains gluten or not
  public boolean containsGluten() {
    return hasGluten;
  }

  /*
   * toString method to print information of each Chip object;
   * print whether or not Chip object contains gluten
   */
  public String toString() {
    if (hasGluten) {
      return this.getName() + "(" + this.getWeightOunces() + ")" + "<Contains Gluten>";
    } else {
      return this.getName() + "(" + this.getWeightOunces() + ")" + "<Gluten Free>";
    }
  }

}
