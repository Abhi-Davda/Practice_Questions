// Given two sorted arrays,the task is to merge them in a sorted manner.
// Input:arr1[]={1,3,4,5},
// arr2[]={2,4,6,8}
// Output:arr3[]={1,2,3,4,4,5,6,8}
// Input:arr1[]={5,8,9},
// arr2[]={4,7,8}
// Output:arr3[]={4,5,7,8,8,9}

import java.util.Scanner;

public class P43 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of 1st array:");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter Elements (sorted)");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("enter size of 2nd array:");
        int m = sc.nextInt();
        int b[] = new int[m];
        System.out.println("Enter Elements (sorted)");
        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
        }

        int c[] = new int[n + m];
        for (int i = 0; i < a.length; i++) {
            c[i] = a[i];
        }
        for (int i = 0; i < b.length; i++) {
            c[i + n] = b[i];
        }
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c.length; j++) {
                if (c[i] < c[j]) {
                    int temp = c[i];
                    c[i] = c[j];
                    c[j] = temp;
                }
            }
        }

        // // Merge two sorted arrays
        // int[] c = new int[n + m];
        // int i = 0, j = 0, k = 0;

        // while (i < n && j < m) {
        // if (a[i] <= b[j]) {
        // c[k++] = a[i++];
        // } else {
        // c[k++] = b[j++];
        // }
        // }

        // // Copy remaining elements
        // while (i < n) {
        // c[k++] = a[i++];
        // }
        // while (j < m) {
        // c[k++] = b[j++];
        // }

        System.out.println("Answer:");
        for (int i : c) {
            System.out.println(i);
        }
        sc.close();
    }
}
