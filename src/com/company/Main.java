package com.company;
import java.util.Scanner;

public class Main {

    public static boolean[] sieve (int[] a) {
        boolean[] prime = new boolean[a.length]; // Set all values to false in new array.
        for (int i = 0; i < prime.length; i++) {
            for (int k = 0 + i; k < prime.length; k++) { // Check each number against all the numbers in the array.
                int divide = a[i]; // Set divider to the next number in the array 2, 3, 4 and so on
                if (a[k] % divide == 0 && !prime[k] && a[k] != a[i]) { // Divide and set all the dividable numbers to true
                    prime[k] = true;
                }
            }
        }
        return prime;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input how many numbers you want to check for prime numbers: ");
        int numbersToCheck = scanner.nextInt() - 1;
        int[] numberArray = new int[numbersToCheck];

        int j = 2;
        for (int i = 0; i < numbersToCheck; i++) { // Create an array with the given numbers from 2 to userInput
            numberArray[i] = j;
            j++;
        }

        numbersToCheck = numbersToCheck + 1; // Correct to get the right number displayed on screen.
        int countOutput = 0;
        System.out.println("Prime numbers found in the range from 2 - " + numbersToCheck);
        for (boolean b : sieve(numberArray)) {
            if (!b) { // Print every time b value from array is false
                System.out.println(numberArray[countOutput]);
            }
            countOutput++;
        }
    }
}

