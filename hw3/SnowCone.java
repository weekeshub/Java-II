// Andrew Weekes
// CS 152
// Homework 3

package cs152.hw3;

// SnowCone child class of NewSnack parent class
public class SnowCone extends NewSnack {

  // class variables
  private String flavor;

  // constructor for SnowCone child class
  public SnowCone(String name, double weightOunces, String flavor) {
    super(name, weightOunces);
    this.flavor = flavor;
  }

  // getter method for flavor variable
  public String getFlavor() {
    return flavor;
  }

  // toString method to print SnowCone object information
  public String toString() {
    return this.getName() + "(" + this.getWeightOunces() + ")" + "<" + this.getFlavor() + ">";
  }

}
