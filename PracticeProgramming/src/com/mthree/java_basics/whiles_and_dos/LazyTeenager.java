package com.mthree.java_basics.whiles_and_dos;

import java.util.*;

public class LazyTeenager {
    public static void main(String[] args) {
        int timesTold = 0;
        int chanceToClean = 10;

        Random random = new Random();

        do {
            System.out.println("Clean your room!!! (x" + ++timesTold + ")");

            if (chanceToClean < random.nextInt(101)) {
                System.out.println("FINE!!! I'll clean my room");
                break;
            } else if (timesTold >= 7) {
                System.out.println("That's IT, I'm doing it!!! YOU'RE GROUNDED AND I'M TAKING YOUR XBOX!");
                break;
            } else {
                chanceToClean += 10;
            }
        } while (true);
    }
}
