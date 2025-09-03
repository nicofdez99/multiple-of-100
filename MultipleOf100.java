/**
 * This program reads an integer from standard input
 * and determines whether it is a multiple of 100 or not.
 *
 * Problem statement:
 * Input: An integer number.
 * Output: "multiple of 100" if the number is divisible by 100,
 *         otherwise "not multiple of 100".
 *
 * Example:
 * Input: 12600
 * Output: multiple of 100
 */

import java.util.Scanner;

public class MultipleOf100 {

    /**
     * Main method that controls program execution.
     * @param args command-line arguments (not used in this program)
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read integer input from user
        int number = scanner.nextInt();

        // Check if number is a multiple of 100
        if (number % 100 == 0) {
            System.out.println("multiple of 100");
        } else {
            System.out.println("not multiple of 100");
        }

        scanner.close();
    }
}
