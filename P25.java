
// WAP to find a Multiplication of 2 Matrix (dimension and value should be entered by user).
import java.util.Scanner;;

public class P25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of rows of A:");
        int x = sc.nextInt();
        System.out.println("Enter no. of cols of A:");
        int y = sc.nextInt();
        int a[][] = new int[x][y];

        System.out.println("---Enter vals of A---:");
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter no. of rows of B:");
        int c = sc.nextInt();
        System.out.println("Enter no. of cols of B:");
        int d = sc.nextInt();

        int b[][] = new int[c][d];

        System.out.println("---Enter vals of B---:");
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < d; j++) {
                b[i][j] = sc.nextInt();
            }
        }
        if (y == c) {
            int n[][] = new int[x][d];
            for (int i = 0; i < x; i++) {
                for (int j = 0; j < d; j++) {
                    for (int k = 0; k < y; k++) {
                        n[i][j] += a[i][k] * b[k][j];
                    }
                }
            }
            System.out.println("----Answer----");
            for (int i = 0; i < x; i++) {
                for (int j = 0; j < d; j++) {
                    System.out.println(n[i][j]);
                }
            }
        } else {
            System.out.println("No multiplication of matrix");
        }
        sc.close();
    }
}
