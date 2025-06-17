
// WAP to find a Factor of a given number (iterative and recursive)
import java.util.Scanner;

public class P4 {
    public static void main(String args[]) {
        System.out.println("Enter No.");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // Iterative
        System.out.println("Factors are:");
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.println(i);
            }
        }

        // Recursive
        int x = n;
        System.out.println("By Recurvise Factors are:");
        factors(n, x);

        sc.close();
    }

    static void factors(int n, int x) {

        if (x == 0)
            return;
        else {
            if (n % x == 0)
                System.out.println(x);
            factors(n, --x);
        }
    }
}