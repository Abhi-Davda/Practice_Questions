// Given an array of coins[]of size n and a target value sum,where coins[i]represent the coins of different denominations.
// You have an infinite supply of each of the coins.The task is to find the minimum number of coins required to make the given value sum.
// If it is not possible to form the sum using the given coins,return-1. 
// Input:coins[]=[25,10,5],sum=30 Output:2 
// Explanation:Minimum 2 coins needed,25 and 5 
// Input:coins[]=[9,6,5,1],sum=19 Output:3 
// Explanation:19=9+9+1 
// Input:coins[]=[4,6,2],sum=5 Output:-1 
// Explanation:Not possible to make the given sum.

import java.util.Arrays;
import java.util.Scanner;

public class P49 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size:");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("enter elements:");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("enter sum:");
        int target = sc.nextInt();
        // Gready type approach
        // Sort descending
        Arrays.sort(a);
        for (int i = 0; i < n / 2; i++) {
            int temp = a[i];
            a[i] = a[n - 1 - i];
            a[n - 1 - i] = temp;
        }

        int sum = target;
        int cnt = 0;
        boolean possible = true;

        while (sum > 0 && possible) {
            possible = false; // assume no coin used this round

            for (int i = 0; i < n; i++) {
                if (a[i] <= sum) {
                    sum -= a[i];
                    cnt++;
                    possible = true; // a coin was used
                    break; // start from first coin again
                }
            }
        }

        if (sum == 0)
            System.out.println("Output: " + cnt);
        else
            System.out.println("Output: -1");
        sc.close();
    }

}

// import java.util.*;

// public class P49 {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);

// // Input
// System.out.println("Enter size of coins array:");
// int n = sc.nextInt();
// int[] coins = new int[n];

// System.out.println("Enter coin denominations:");
// for (int i = 0; i < n; i++) {
// coins[i] = sc.nextInt();
// }

// System.out.println("Enter target sum:");
// int sum = sc.nextInt();

// // DP array: dp[i] = minimum coins needed for sum i
// int[] dp = new int[sum + 1];
// Arrays.fill(dp, Integer.MAX_VALUE);
// dp[0] = 0;

// // Build the DP table
// for (int i = 1; i <= sum; i++) {
// for (int coin : coins) {
// if (coin <= i && dp[i - coin] != Integer.MAX_VALUE) {
// dp[i] = Math.min(dp[i], dp[i - coin] + 1);
// }
// }
// }

// // Result
// if (dp[sum] == Integer.MAX_VALUE) {
// System.out.println("Output: -1");
// } else {
// System.out.println("Output: " + dp[sum]);
// }
// }
// }
