package com.mthree.java_basics.random;

import java.util.*;

public class GuessMeMore {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int numb = random.nextInt(200) - 100;
        System.out.println("I've chosen a number between -100 and 100. Bet you can't guess it!");

        System.out.print("Your guess: ");
        int guess = Integer.parseInt(scanner.nextLine());

        while (guess != numb) {
            if (guess > numb) {
                System.out.print("Too high! Try again: ");
                guess = Integer.parseInt(scanner.nextLine());
            } else {
                System.out.print("Too low! Try again: ");
                guess = Integer.parseInt(scanner.nextLine());
            }
        }

        System.out.println("You guessed it!");
    }
}
