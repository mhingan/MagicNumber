package org.example;

import java.util.Random;
import java.util.Scanner;

public class HandleNumber {

    public int generateNumber() {
        Random rand = new Random();
        return rand.nextInt(0, 100);
    }

    public void checkNumber(int userNumber, int numberOfTries) {

        int numberGenerated = generateNumber();
        int index = numberOfTries;
        Scanner scanner = new Scanner(System.in);


        if(numberOfTries<0){
            throw new IllegalArgumentException("Number of tries exceeds the minimum allowed");
        }

        if(numberOfTries < 2){
            System.out.println("You have selected " + numberOfTries + " tries. LEVEL: IMPOSSIBLE" );
        } else if (numberOfTries > 2 && numberOfTries < 5) {
            System.out.println("You have selected " + numberOfTries + " tries. LEVEL: HARD" );
        } else if (numberOfTries > 5 && numberOfTries < 10) {
            System.out.println("You have selected " + numberOfTries + " tries. LEVEL: MEDIUM" );
        } else {
            System.out.println("You have selected " + numberOfTries + " tries. LEVEL: EASY" );
        }


        while (index != 0) {
            System.out.println("Please enter a number between 1 and 100: ");
            try{
                if (userNumber < numberGenerated) {
                    System.out.println("Bigger than " + userNumber);
                    index--;
                    userNumber = scanner.nextInt();
                } else if (userNumber > numberGenerated) {
                    System.out.println("Smaller than " + userNumber);
                    index--;
                    userNumber = scanner.nextInt();
                } else {
                    System.out.println("You win!");
                    break;
                }
            } catch (Exception e){
                System.out.println("Error reading the input: " + e.getMessage());
            }
        }
        if(index == 0){
            System.out.println("You ran out of tries! Sorry!");
        }
    }
}
