// Write a program to generate very big (at least 11 digits) and calculate the total of all those numbers. 
// In the program, User will input the first digit i.e. "D", input count i.e. "N" which needs to generate automatically sequential bases from 1 to N, other remaining digits should be 0
// 
// Input Validation: 0 ≤ D ≤ 9 
// 1 < N ≤ 1000
// Explanation Let's assume the inputs from the user for D is 5 and N is 50 
// ● So the generated numbers will be 50000000001, 50000000002, 50000000003, 50000000004.... 50000000050. 
// ● The calculated sum of above generated numbers is 2500000001275.
// ● So output of this program should be 2500000001275.

import java.math.BigInteger;
import java.util.Scanner;

public class P57 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Input
        System.out.print("Enter the first digit (D): ");
        int D = scanner.nextInt();

        System.out.print("Enter the count of numbers to generate (N): ");
        int N = scanner.nextInt();

        // Validation
        // if (D < 0 || D > 9) {
        // System.out.println("Invalid input! D must be between 0 and 9.");
        // return;
        // }
        // if (N <= 1 || N > 1000) {
        // System.out.println("Invalid input! N must be greater than 1 and less than or
        // equal to 1000.");
        // return;
        // }

        BigInteger totalSum = BigInteger.ZERO;

        for (int i = 1; i <= N; i++) {
            // Build the number as string
            String sequence = String.valueOf(i);
            int zeroCount = 10 - sequence.length(); // Total digits before sequence = 10 (1 digit for D, rest zeros)
            StringBuilder numberBuilder = new StringBuilder();
            numberBuilder.append(D);
            for (int j = 0; j < zeroCount; j++) {
                numberBuilder.append('0');
            }
            numberBuilder.append(sequence);

            // Convert to BigInteger
            BigInteger bigNumber = new BigInteger(numberBuilder.toString());

            // Uncomment to see generated numbers
            // System.out.println("Generated: " + bigNumber);

            // Add to total
            totalSum = totalSum.add(bigNumber);
        }

        // Output result
        System.out.println("Total sum of all generated numbers: " + totalSum);
        scanner.close();
    }
}
