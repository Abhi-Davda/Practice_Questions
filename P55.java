// Write a program to find and print the elements that are non-duplicate (i.e., unique) between two arrays. An element is considered non-duplicate if it appears in only one of the two arrays, but not in both. 
// Input: arr1: 1 2 3 4 ; arr2: 3 4 5 6 ; Output: 1 2 5 6

import java.util.Scanner;

public class P55 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of 1st array: ");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("enter elements: ");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Enter size of 2nd array: ");
        int m = sc.nextInt();
        int b[] = new int[m];
        System.out.println("enter elements: ");
        for (int i = 0; i < b.length; i++) {
            b[i] = sc.nextInt();
        }

        int output[] = new int[n + m];
        int k = 0;
        for (int i = 0; i < a.length; i++) {
            boolean noduplicate = true;
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    noduplicate = false;
                }
            }
            if (noduplicate) {
                output[k++] = a[i];
            }
        }
        for (int i = 0; i < b.length; i++) {
            boolean noduplicate = true;
            for (int j = 0; j < a.length; j++) {
                if (b[i] == a[j]) {
                    noduplicate = false;
                }
            }
            if (noduplicate) {
                output[k++] = b[i];
            }
        }
        System.out.println("Answer: ");
        for (int z = 0; z < k; z++) {
            System.out.print(output[z] + " ");
        }
        sc.close();
    }
}

// import java.util.*;

// public class P55 {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);

// System.out.println("Enter size of 1st array:");
// int n = sc.nextInt();
// int[] a = new int[n];
// System.out.println("Enter elements of 1st array:");
// for (int i = 0; i < n; i++) {
// a[i] = sc.nextInt();
// }

// System.out.println("Enter size of 2nd array:");
// int m = sc.nextInt();
// int[] b = new int[m];
// System.out.println("Enter elements of 2nd array:");
// for (int i = 0; i < m; i++) {
// b[i] = sc.nextInt();
// }

// // Step 1: Add all elements from arr1 to the set
// Set<Integer> unique = new HashSet<>();
// for (int num : a) {
// unique.add(num);
// }

// // Step 2: Process arr2
// for (int num : b) {
// if (unique.contains(num)) {
// unique.remove(num); // remove if it's in both
// } else {
// unique.add(num); // add if it's only in arr2
// }
// }

// // Step 3: Print result
// System.out.println("Answer:");
// for (int num : unique) {
// System.out.print(num + " ");
// }

// sc.close();
// }
// }
