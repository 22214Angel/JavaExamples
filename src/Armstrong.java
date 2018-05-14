package com.thoughtworks.iwp.utils;

import java.util.Scanner;

public class Armstrong {
    static final int BASE_10 = 10;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();
        Armstrong armstrong = new Armstrong();
        armstrong.checkArmstrongNumber(inputNumber);
    }

    private int countDigits(int number) {
        int count = 0;
        while (number != 0) {
            number /= BASE_10;
            count++;
        }
        return count;
    }

    private void checkArmstrongNumber(int inputNumber) {
        int digit;
        int inputCopy = inputNumber;
        int sumOfDigitsRaisedToLength = 0;
        int lengthOfNumber = countDigits(inputNumber);
        while (inputNumber > 0) {
            digit = inputNumber % BASE_10;
            inputNumber /= BASE_10;
            sumOfDigitsRaisedToLength += Math.pow(digit, lengthOfNumber);
        }
        if(inputCopy == sumOfDigitsRaisedToLength)
            System.out.println("armstrong");
        else
            System.out.println("Not an armstrong");
    }
}