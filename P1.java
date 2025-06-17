
// WAP to find a sum of even number into 1D array.
import java.util.Scanner;

public class P1 {
    public static void main(String[] args) {
        int n;
        int sum = 0;
        System.out.println("Enter length of Array");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int a[];
        a = new int[n];
        for (int i = 0; i < a.length; i++) {
            System.out.print("Enter No.:");
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                sum += a[i];
            }
        }
        System.out.println("Sum=" + sum);
        sc.close();
    }
}