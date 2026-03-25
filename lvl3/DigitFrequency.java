package lvl3;

import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step a: Take input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int temp = number;

        // Step b: Count digits
        int count = 0;
        while (temp != 0) {
            count++;
            temp /= 10;
        }

        // Edge case: if number is 0
        if (number == 0) {
            count = 1;
        }

        // Step c: Store digits in array
        int[] digits = new int[count];
        temp = number;

        for (int i = count - 1; i >= 0; i--) {
            digits[i] = temp % 10;
            temp /= 10;
        }

        // Step d: Frequency array
        int[] frequency = new int[10]; // digits 0–9

        for (int i = 0; i < count; i++) {
            frequency[digits[i]]++;
        }

        // Step e: Display frequency
        System.out.println("\nDigit Frequencies:");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + " occurs " + frequency[i] + " times");
            }
        }

        sc.close();
    }
}
