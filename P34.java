// Given an integer n, the task is to find the first n rows of Pascal’s triangle. 
// Input : N = 5 
// Output: 
//     1 
//    1 1 
//   1 2 1 
//  1 3 3 1 
// 1 4 6 4 1

import java.util.Scanner;

public class P34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter N:");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int k = n - i - 1; k > 0; k--) {
                System.out.print(" ");
            }
            int val = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(val + " ");
                val = val * (i - j) / (j + 1);
            }
            System.out.println();
        }
        sc.close();
    }
}

// public class PascalsTriangleRecursive {

// // Recursive method to calculate binomial coefficient C(n, k)
// static int binomialCoeff(int n, int k) {
// if (k == 0 || k == n)
// return 1;
// return binomialCoeff(n - 1, k - 1) + binomialCoeff(n - 1, k);
// }

// // Function to print Pascal's Triangle up to n rows
// public static void printPascalsTriangle(int n) {
// for (int i = 0; i < n; i++) {
// // Print leading spaces for triangle shape
// for (int space = 0; space < n - i - 1; space++) {
// System.out.print(" ");
// }

// for (int j = 0; j <= i; j++) {
// System.out.print(binomialCoeff(i, j) + " ");
// }
// System.out.println();
// }
// }

// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.print("Enter number of rows: ");
// int n = sc.nextInt();

// printPascalsTriangle(n);
// sc.close();
// }
// }