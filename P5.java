
// WAP to find a factorial of a given integer (iterative and recursive)
import java.util.Scanner;

public class P5 {
    public static void main(String args[]) {
        System.out.println("Enter no.");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = 1;
        // Iterative
        for (int i = n; i > 0; i--) {
            x = x * i;
        }
        System.out.println("Factorial : " + x);

        // Recursive
        int fac = factorial(n);
        System.out.println("Factorial_R : " + fac);

        sc.close();
    }

    static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return (n * factorial(n - 1));
        }
    }
}
