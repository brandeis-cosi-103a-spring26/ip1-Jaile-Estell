package edu.brandeis.cosi103a.ip1;

import java.util.Scanner;
import java.util.Random;

/**
 * Dice Game!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int player1Score = 0;
        int player2Score = 0;
        
        System.out.println("Welcome to the Dice Game!");
        System.out.println("Each player gets 10 turns. Roll a die, re-roll up to 2 times, then keep the final value.");
        
        for (int turn = 1; turn <= 10; turn++) {
            System.out.println("\n--- Turn " + turn + " ---");
            
            // Player 1's turn
            System.out.println("Player 1's turn:");
            int dieValue = rollDie(random);
            System.out.println("Rolled: " + dieValue);
            dieValue = handleReRolls(scanner, random, dieValue);
            player1Score += dieValue;
            System.out.println("Player 1's score: " + player1Score);
            
            // Player 2's turn
            System.out.println("Player 2's turn:");
            dieValue = rollDie(random);
            System.out.println("Rolled: " + dieValue);
            dieValue = handleReRolls(scanner, random, dieValue);
            player2Score += dieValue;
            System.out.println("Player 2's score: " + player2Score);
        }
        
        System.out.println("\n--- Final Scores ---");
        System.out.println("Player 1: " + player1Score);
        System.out.println("Player 2: " + player2Score);
        
        if (player1Score > player2Score) {
            System.out.println("Player 1 wins!");
        } else if (player2Score > player1Score) {
            System.out.println("Player 2 wins!");
        } else {
            System.out.println("It's a tie!");
        }
        
        scanner.close();
    }
    
    static int rollDie(Random random) {
        return random.nextInt(6) + 1;
    }
    
    static int handleReRolls(Scanner scanner, Random random, int currentValue) {
        int reRollsLeft = 2;
        while (reRollsLeft > 0) {
            System.out.print("Re-roll? (y/n): ");
            String input = scanner.nextLine().trim().toLowerCase();
            if (input.equals("y") || input.equals("yes")) {
                currentValue = rollDie(random);
                System.out.println("Rolled: " + currentValue);
                reRollsLeft--;
            } else if (input.equals("n") || input.equals("no")) {
                break;
            } else {
                System.out.println("Please enter y or n.");
            }
        }
        return currentValue;
    }
}
