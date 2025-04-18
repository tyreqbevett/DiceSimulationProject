import java.util.Scanner;
import java.io.*;

/**
 This class reads numbers from a file, calculates the
 mean and standard deviation, and writes the results
 to a file.
 */

public class StatsDemo {
   public static void main(String[] args) throws IOException {
      double sum = 0;      // The sum of the numbers
      int count = 0;       // The number of numbers added
      double mean = 0;     // The average of the numbers
      double stdDev = 0;   // The standard deviation
      double difference;   // The value and mean difference

      // Create an object of type Scanner
      Scanner keyboard = new Scanner(System.in);
      String filename;     // The user input file name

      // Prompt the user and read in the file name
      System.out.println("This program calculates statistics on a file containing a series of numbers.");
      System.out.print("Enter the file name: ");
      filename = keyboard.nextLine();

      // TASK #4: Calculating the Mean
      //Code By Tyreq Bevett
      File file = new File(filename);
      Scanner inputFile = new Scanner(file);

      while (inputFile.hasNextDouble()) {
         sum += inputFile.nextDouble();
         count++;
      }
      inputFile.close();

      // Calculate and store the mean
      if (count > 0) {
         mean = sum / count;
      }

      // TASK #5: Calculating the Standard Deviation
      inputFile = new Scanner(file); // Reopen file
      sum = 0;   // Reset sum
      count = 0; // Reset count

      while (inputFile.hasNextDouble()) {
         difference = inputFile.nextDouble() - mean;
         sum += Math.pow(difference, 2);
         count++;
      }
      inputFile.close();

      // Calculate standard deviation
      if (count > 0) {
         stdDev = Math.sqrt(sum / count);
      }

      // TASK #3: Writing output to a file
      PrintWriter outputFile = new PrintWriter("Results.txt");
      outputFile.printf("mean = %.3f%n", mean);
      outputFile.printf("standard deviation = %.3f%n", stdDev);
      outputFile.close();

      System.out.println("Results have been written to Results.txt.");
   }
}
