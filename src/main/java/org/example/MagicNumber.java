package org.example;

import java.util.Scanner;

public class MagicNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        HandleNumber handleNumber = new HandleNumber();
        int randomNumberGenerated = handleNumber.generateNumber();

        System.out.println("Hello! PLease insert the nunmbers of tries you want for this round: ");
        int tries = scanner.nextInt();

        //System.out.println("Great! You have chosen " + tries + " tries. Now, please insert the maximum number you want to be generated: ");
        //int maximumNumber = scanner.nextInt();

        handleNumber.checkNumber(randomNumberGenerated, tries);

    }
}
