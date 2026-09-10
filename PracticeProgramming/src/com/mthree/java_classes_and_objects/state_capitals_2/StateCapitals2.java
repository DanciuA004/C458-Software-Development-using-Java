package com.mthree.java_classes_and_objects.state_capitals_2;

import java.awt.image.AffineTransformOp;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class StateCapitals2 {
    public static void main(String[] args) throws IOException {
        StateCapitals2 s = new StateCapitals2();
        s.game();
    }

    public void game() throws IOException {
        int points = 0;
        Map<String,String> map = new HashMap<>();
        Random random = new Random();
        Scanner input = new Scanner(System.in); // User input
        Scanner scanner = new Scanner( // File input
                new BufferedReader(
                        new FileReader(
                                "src/com/mthree/java_classes_and_objects/state_capitals_2/StateCapitals.txt"
                        )));

        // Go through the file and populate HashMap
        while (scanner.hasNextLine()) {
            String currentLine = scanner.nextLine();
            map.put(currentLine.split("::")[0],currentLine.split("::")[1]);
        }

        System.out.print("\nHow many rounds would you like? ");
        int rounds = Integer.parseInt(input.nextLine());

        // Game starts
        System.out.println(map.size() + " states and capitals are loaded!");
        System.out.println("\nHere are the states: ");

        // Prints out all states
        for (String key : map.keySet()) {
            System.out.print(key + ", ");
        }

        // Makes an ArrayList of the key set to randomly pick from
        List<String> keys = new ArrayList<>(map.keySet());

        // Game loop for number of rounds
        for (int i = 0; i < rounds; i++) {
            String randomKey = keys.get(random.nextInt(keys.size()));

            System.out.print("\nREADY TO TEST YOUR KNOWLEDGE? WHAT IS THE CAPITAL OF " + randomKey + "?");
            String capital = input.nextLine();

            if (capital.equals(map.get(randomKey))) {
                System.out.println("Correct!");
                points++;
            } else {
                System.out.println("Wrong! The capital is " + map.get(randomKey));
                points--;
            }
        }
        System.out.println("\nYour points: " + points);
        System.out.println("\nWould you like to play again? (y/n)");
        if (input.nextLine().equals("y")) {
            game();
        } else {
            System.out.println("Thanks for playing!");
        }
    scanner.close();
    }
}
