package com.mthree.java_basics.arrays;

import java.util.*;

public class HiddenNuts {
    public static void main(String[] args) {
        Random squirrel = new Random();
        String[] hidingSpots = new String[100];

        hidingSpots[squirrel.nextInt(hidingSpots.length)] = "Nut";
        System.out.println("The nut has been hidden ...");

        for (int i = 0; i < hidingSpots.length; i++) {
            if ("Nut".equals(hidingSpots[i])) {
                System.out.println("Found it! It's in spot #" + i);
            }
        }
    }
}
