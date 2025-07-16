// Given an array arr[], the task is to find the subarray that has the maximum sum and return its sum.
// Input: arr[] = {2, 3, -8, 7, -1, 2, 3} Output: 11 
// Explanation: The subarray {7, -1, 2, 3} has the largest sum 11.
// Input: arr[] = {5, 4, 1, 7, 8} Output: 25 
// Explanation: The subarray {5, 4, 1, 7, 8} has the largest sum 25.

import java.util.Scanner;

public class P47 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter elements: ");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        int fsum = 0;
        for (int i = 0; i < a.length; i++) {
            int sum = 0;
            for (int j = i; j < a.length; j++) {
                sum += a[j];
                if (fsum < sum) {
                    fsum = sum;
                }
            }
        }
        System.out.println("Largest Sum : " + fsum);
        sc.close();
    }
}

// // Kadane’s algorithm
// private static int maxSubArraySum(int[] a) {
// int currentMax = a[0]; // max ending at the current position
// int maxSoFar = a[0]; // max seen so far

// for (int i = 1; i < a.length; i++) {
// // either extend previous subarray or start fresh at a[i]
// currentMax = Math.max(a[i], currentMax + a[i]);
// // update overall max
// maxSoFar = Math.max(maxSoFar, currentMax);
// }
// return maxSoFar;
// }