
// Given the number of rows and columns, print the corresponding swastika pattern using loops. 
// Note: The number of rows and columns should be the same and an odd number. This will generate a perfect swastika pattern.
import java.util.Scanner;

public class P33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row and col no.(it must be odd):");
        int n = sc.nextInt();

        if (n % 2 == 0 || n < 3) {
            System.out.println("Enter odd and >3 value");
        }

        int mid = n / 2;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0) {
                    if (j == 0 || j >= mid) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                } else if (i > 0 && i < mid) {
                    if (j == 0 || j == mid) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                if (i == mid) {
                    System.out.print("*");
                }
                if (i > mid && i < n - 1) {
                    if (j == mid || j == n - 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                } else if (i == n - 1) {
                    if (j <= mid || j == n - 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }

            }
            System.out.println();
        }
        sc.close();
    }
}