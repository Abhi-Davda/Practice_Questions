// Given an array arr[] of n integers and a target value, the task is to find whether there is a pair of elements in the array whose sum is equal to target.
// Input: arr[] = [0, -1, 2, -3, 1], target = -2 
// Output: true 
// Explanation: There is a pair (1, -3) with the sum equal to the given target, 1 + (-3) = -2.
// Input: arr[] = [1, -2, 1, 0, 5], target = 0 
// Output: false 
// Explanation: There is no pair with sum equals to given target.

import java.util.Scanner;

public class P46 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array: ");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("enter elements: ");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("enter target:");
        int t = sc.nextInt();
        boolean output = false;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[i] + a[j] == t && i != j) {
                    output = true;
                }
            }
        }
        System.out.println("Output :" + output);
        sc.close();

    }
}
