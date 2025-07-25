// Given an array of positive integers arr[] of size n, the task is to find the second largest distinct element in the array. Note: If the second largest element does not exist, return -1.
// Input: arr[] = [12, 35, 1, 10, 34, 1] ;  Output: 34 
// Explanation: The largest element of the array is 35 and the second largest element is 34. 
// Input: arr[] = [10, 10, 10] ; Output: -1 
// Explanation: The largest element of the array is 10 there is no second largest element.

import java.util.Scanner;

public class P56 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("enter elements: ");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        int max = a[0];
        int secondmax = -1;

        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            } else if (a[i] < max && a[i] > secondmax) {
                secondmax = a[i];
            }
        }
        System.out.println("Max :" + max);
        System.out.println("Second Max :" + secondmax);
        sc.close();
    }
}
