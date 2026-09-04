package com.mthree.java_basics.rock_paper_scissors;

import java.util.*;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        RockPaperScissors rps = new RockPaperScissors();
        rps.game(random, scanner); // Initializing game loop
    }

    // Method that asks the user what choice they want to pick and validates it
    public int userChoice(Scanner scanner) {
        System.out.print("Do you pick number 0. Rock, 1. Paper or 2. Scissors? ");
        int choiceUser = scanner.nextInt();

        if (choiceUser < 0 || choiceUser > 2) {
            System.out.println("That is an invalid choice. Choose again.\n");
            userChoice(scanner); // Loop until user chooses correct option
        }
        return choiceUser;
    }

    public void game(Random random, Scanner scanner) {
        int winsUser = 0;
        int winsComputer = 0;
        int ties = 0;
        String[] choices = {"Rock", "Paper", "Scissors"};

        // User choosing amount of rounds
        System.out.println("\nHow many rounds would you like to play?");
        System.out.print("Pick a number of rounds between 1 and 10: ");
        int rounds = scanner.nextInt();

        // Validation for number of rounds
        if (rounds < 1 || rounds > 10) {
            System.out.println("That is not a valid number of rounds!");
            game(random, scanner); // Loop until user chooses correct option
        }

        for (int i = 0; i < rounds; i++) {
            // User making choice
            int choiceUser = userChoice(scanner);

            // Computer making choice
            int choiceComputer = random.nextInt(3);
            System.out.println("Computer chose: " + choices[choiceComputer]);

            // If choices are the same
            if (choiceUser == choiceComputer) {
                System.out.println("It's a tie!\n");
                ties++;
                // All options for user winning
            } else if (
                    (choiceUser == 0 && choiceComputer == 2) ||
                            (choiceUser == 1 && choiceComputer == 0) ||
                            (choiceUser == 2 && choiceComputer == 1)
            ) {
                System.out.println("User wins!\n");
                winsUser++;
            } else {
                System.out.println("Computer wins!\n");
                winsComputer++;
            }
        }

        // End of game, printing results
        System.out.println("\nThe game has ended! Here are the final results:");
        System.out.println("User wins: " + winsUser);
        System.out.println("Computer wins: " + winsComputer);
        System.out.println("Number of ties: " + ties);

        // Checking the overall winner
        String winner = " ";
        if (winsUser > winsComputer) {
            winner = "User wins!";
        } else if (winsComputer > winsUser) {
            winner = "Computer wins!";
        } else {
            winner = "It's a tie!";
        }

        System.out.println("\nThe overall winner is: " + winner);
        System.out.println("\nDo you want to play again (y/n)?");
        String loop = scanner.next();
        if (loop.equals("y")) {
            game(random, scanner);
        }
        System.out.println("Thanks for playing!");
    }
}
