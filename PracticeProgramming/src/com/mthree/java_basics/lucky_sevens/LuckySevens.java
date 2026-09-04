package com.mthree.java_basics.lucky_sevens;

import java.util.*;

public class LuckySevens {
    public static void main(String[] args) {
        int rollsCount = 0;
        double moneyHighest = 0;
        int rollsAtHighest = 0;
        int dice1 = 0;
        int dice2 = 0;

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many dollars do you have? ");
        double money = scanner.nextDouble();

        while (money > 0) {
            dice1 = random.nextInt(5) + 1;
            dice2 = random.nextInt(5) + 1;
            rollsCount++;

            if (dice1 + dice2 == 7) {
                money += 4;
            } else {
                money--;
            }

            if (money > moneyHighest) {
                moneyHighest = money;
                rollsAtHighest = rollsCount;
            }
        }

        System.out.println("You are broke after " + rollsCount + " rolls.");
        System.out.println("You should have quit after " + rollsAtHighest + " rolls when you had $" + moneyHighest + ".");
    }
}
