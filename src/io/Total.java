package io;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.File;
import java.util.Scanner;

/**
 *
 * Created by john on 16-9-7.
 */
public class Total {
  public static void main (String[] args) throws FileNotFoundException {

    // Prompt for the input and output file names
    Scanner scanner = new Scanner(System.in);
    System.out.print("Input file: ");
    String inputFileName = scanner.next();
    System.out.print("Output file: ");
    String outputFileName = scanner.next();

    // Construct the Scanner and PrintWriter objects for reading and writing
    String currentPath = Total.class.getResource("").getFile();
    File inputFile = new File(currentPath + inputFileName);
    Scanner in = new Scanner(inputFile);
    PrintWriter out = new PrintWriter(currentPath + outputFileName);

    // Read the input and write the output
    double total = 0;
    while (in.hasNextDouble()) {
      double value = in.nextDouble();
      System.out.printf("%15.2f\n", value);
      total += value;
    }
    System.out.printf("%8.2f\n", total);

    in.close();
    out.close();
  }
}
