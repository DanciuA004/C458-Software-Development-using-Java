package com.mthree.java_basics.methods;

import java.util.Random;

public class BarelyControlledChaos {
    public static void main(String[] args) {
        Random random = new Random();

        String color = randomColour(random); // call color method here
        String animal = randomAnimal(random); // call animal method again here
        String colorAgain = randomColour(random); // call color method again here
        int weight = randomNumber(random, 200, 5); // call number method,
        // with a range between 5 - 200
        int distance = randomNumber(random, 20, 10); // call number method,
        // with a range between 10 - 20
        int number = randomNumber(random, 20000, 10000); // call number method,
        // with a range between 10000 - 20000
        int time = randomNumber(random, 6, 2); // call number method,
        // with a range between 2 - 6

        System.out.println("Once, when I was very small...");

        System.out.println("I was chased by a " + color + ", "
                + weight + "lb " + " miniature " + animal
                + " for over " + distance + " miles!!");

        System.out.println("I had to hide in a field of over "
                + number + " " + colorAgain + " poppies for nearly "
                + time + " hours until it left me alone!");

        System.out.println("\nIt was QUITE the experience, "
                + "let me tell you!");
    }

    public static String randomColour(Random random) {
        String[] colours = {"red", "orange", "yellow", "green", "blue", "purple"};
        return colours[random.nextInt(colours.length)];
    }

    public static String randomAnimal(Random random) {
        String[] animals = {"dog", "cat", "hamster", "bunny", "rat", "turtle"};
        return animals[random.nextInt(animals.length)];
    }

    public static int randomNumber(Random random, int max, int min) {
        return random.nextInt(max - min);
    }
}
