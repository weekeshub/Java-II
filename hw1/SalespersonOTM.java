package cs152.hw1;
// Andrew Weekes
// CS 152-02
// Homework 1

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SalespersonOTM {

  public static void main(String[] args) throws FileNotFoundException {

    // Create scanner
    File fileName = new File("salesSlips.txt");
    Scanner fileScanner = new Scanner(fileName);
    String[][] data = new String[499][3];

    // move past header
    fileScanner.nextLine();


    // read file and split into data array
    int row = 0;
    int col = 0;
    while (fileScanner.hasNextLine()) {
      String line = fileScanner.nextLine();
      data[row] = line.split(",");
      row++;
    }
    fileScanner.close();

    // create variables salesID, product, and amount by parsing through data array
    // 5 is number of products, 7 is number of salesman
    double[][] sales = new double[7][5];
    int salesID = 0;
    int product = 0;
    double amount = 0;
    for (row = 0; row < data.length; row++) {
      salesID = Integer.parseInt(data[row][0]);
      product = Integer.parseInt(data[row][1]);
      amount = Double.parseDouble(data[row][2]);
      sales[product][salesID] += amount;
    }

    // calculate totals for each sales person
    for (row = 0; row < sales.length; row++) {
      for (col = 0; col < sales[row].length; col++) {
        sales[0][col] += sales[row][col];
      }
    }

    // calculate totals for each product
    for (row = 0; row < sales.length; row++) {
      for (col = 0; col < sales[row].length; col++) {
        sales[row][0] += sales[row][col];
      }
    }

    // create table to display results in tabular format
    System.out.printf("                            Sales Person\n");
    System.out.printf("                Total      1        2        3        4\n");

    for (row = 0; row < sales.length; row++) {
      sales[0][0] = 0;
      System.out.printf("%s", (row == 0 ? "Total" : "    "));
      System.out.printf("%s", (row == 3 ? "Product" : "       "));
      System.out.print("\s");
      if (row >= 1) {
      System.out.printf("%s", (row));
      }
      for (col = 0; col < sales[row].length; col++) {
        System.out.printf("%9.2f", sales[row][col]);
      }
      System.out.println();
    }


  }
}
