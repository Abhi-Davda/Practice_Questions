// Write a program to print a center-aligned pyramid pattern where each row contains numbers increasing from 1 up to the row number and then decreasing back to 1.
//  Input:3 
//  Output:
//   1 
//  121 
// 12321

import java.util.Scanner;

public class P54 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no:");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int k = n - i; k > 0; k--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
        sc.close();
    }
}