// Given a 2D square matrix, find the sum of elements in Principal and Secondary diagonals. 
// For example, consider the following 4 X 4 input matrix. Input: 4 
// 1 2 3 4
// 4 3 2 1 
// 7 8 9 6 
// 6 5 4 3
// Output: Principal Diagonal: 16 ; Secondary Diagonal: 20

import java.util.Scanner;

public class P50 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter row and col size:");
        int n = sc.nextInt();
        int a[][] = new int[n][n];
        System.out.println("Enter elements");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        int sumPD = 0;
        int sumSD = 0;

        for (int i = 0; i < a.length; i++) {
            sumPD += a[i][i];
        }

        for (int i = 0; i < a.length; i++) {
            sumSD += a[i][n - i - 1];
        }

        System.out.println("Principal Diagonal: " + sumPD + ", Secondary Diagonal: " + sumSD);
        sc.close();
    }
}
