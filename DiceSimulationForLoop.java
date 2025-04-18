import java.util.Random;   // Needed for the Random class

/**
 This class simulates rolling a pair of dice 10,000 times
 and counts the number of times doubles are rolled for
 each different pair of doubles using a for loop.
 */

public class DiceSimulationForLoop {
    public static void main(String[] args) {
        final int NUMBER = 10000;  // Number of dice rolls

        // A random number generator used in simulating the rolling of dice
        Random generator = new Random();

        int die1Value;       // Value of the first die
        int die2Value;       // Value of the second die
        int snakeEyes = 0;   // Number of snake eyes rolls (double 1s)
        int twos = 0;        // Number of double two rolls
        int threes = 0;      // Number of double three rolls
        int fours = 0;       // Number of double four rolls
        int fives = 0;       // Number of double five rolls
        int sixes = 0;       // Number of double six rolls

        // TASK #2: Using a for loop to roll dice and count doubles
        //Code By Tyreq Bevett
        for (int count = 0; count < NUMBER; count++) {
            die1Value = generator.nextInt(6) + 1;  // Rolling first die (1-6)
            die2Value = generator.nextInt(6) + 1;  // Rolling second die (1-6)

            if (die1Value == die2Value) {  // Check if we rolled doubles
                switch (die1Value) {
                    case 1 -> snakeEyes++;  // Double 1s
                    case 2 -> twos++;       // Double 2s
                    case 3 -> threes++;     // Double 3s
                    case 4 -> fours++;      // Double 4s
                    case 5 -> fives++;      // Double 5s
                    case 6 -> sixes++;      // Double 6s
                }
            }
        }

        // Display the results
        System.out.println("You rolled snake eyes " + snakeEyes + " out of " + NUMBER + " rolls.");
        System.out.println("You rolled double twos " + twos + " out of " + NUMBER + " rolls.");
        System.out.println("You rolled double threes " + threes + " out of " + NUMBER + " rolls.");
        System.out.println("You rolled double fours " + fours + " out of " + NUMBER + " rolls.");
        System.out.println("You rolled double fives " + fives + " out of " + NUMBER + " rolls.");
        System.out.println("You rolled double sixes " + sixes + " out of " + NUMBER + " rolls.");
    }
}
