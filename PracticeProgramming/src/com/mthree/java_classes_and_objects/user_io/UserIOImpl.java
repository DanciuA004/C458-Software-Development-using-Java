package com.mthree.java_classes_and_objects.user_io;

import java.util.Scanner;

public class UserIOImpl implements UserIO {
    Scanner scanner = new Scanner(System.in);
    String inputString;
    int inputInteger;
    double inputDouble;
    float inputFloat;
    long inputLong;

    @Override
    public void print(String message) {
        System.out.print(message);
    }

    @Override
    public String readString(String prompt) {
        System.out.print(prompt);
        inputString = scanner.nextLine();
        return inputString;
    }

    @Override
    public int readInt(String prompt) {
        System.out.print(prompt);
        inputInteger = scanner.nextInt();
        return inputInteger;
    }

    public int readInt(String prompt, int min, int max) {
        inputInteger = readInt(prompt);
        if (inputInteger < min ||  inputInteger > max) {
            readInt(prompt, min, max);
        }
        return inputInteger;
    }

    @Override
    public double readDouble(String prompt) {
        System.out.print(prompt);
        inputDouble = scanner.nextDouble();
        return inputDouble;
    }

    public double readDouble(String prompt, double min, double max) {
        inputDouble = readDouble(prompt);
        if (inputDouble < min ||  inputDouble > max) {
            readDouble(prompt, min, max);
        }
        return inputDouble;
    }

    @Override
    public float readFloat(String prompt) {
        System.out.print(prompt);
        inputFloat = scanner.nextFloat();
        return inputFloat;
    }

    public float readFloat(String prompt, float min, float max) {
        inputFloat = readFloat(prompt);
        if (inputFloat < min ||  inputFloat > max) {
            readFloat(prompt, min, max);
        }
        return inputFloat;
    }

    @Override
    public long readLong(String prompt) {
        System.out.print(prompt);
        inputLong = scanner.nextLong();
        return inputLong;
    }

    public long readLong(String prompt, long min, long max) {
        inputLong = readLong(prompt);
        if (inputLong < min ||  inputLong > max) {
            readLong(prompt, min, max);
        }
        return inputLong;
    }
}
