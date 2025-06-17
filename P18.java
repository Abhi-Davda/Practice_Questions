// WAP to check weather number is present in array or not (using recursion only).
// the function’s syntax is given below
// Int isInArray(int a[],int m);
// Where int a[] is Array of integer and m is element to be searched.

import java.util.Scanner;

public class P18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no. of elements to Add:");
        int n = sc.nextInt();
        int a[] = new int[n];

        System.out.println("---Enter Elemnets---");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Enter element to Search:");
        int s = sc.nextInt();
        int ans = isInArray(a, s);
        if (ans == 1) {
            System.out.println("Element Found");
        } else {
            System.out.println("Element Not Found");
        }
        sc.close();
    }

    static int isInArray(int a[], int m) {
        return isInArrayHelper(a, m, 0);
    }

    static int isInArrayHelper(int a[], int m, int index) {
        if (index >= a.length) {
            return 0;
        }
        if (a[index] == m) {
            return 1;
        }
        return isInArrayHelper(a, m, index + 1);
    }
}
