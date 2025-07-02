
// Write a program that prints the Fibonacci series up to a given number of terms using recursion.
// Input: n = 5 Output: 0 1 1 2 3
import java.util.Scanner;

public class P39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = sc.nextInt();
        System.out.println(0);
        System.out.println(1);
        fib(0, 1, n - 2);
        sc.close();
    }

    static void fib(int a, int b, int n) {
        if (n == 0) {
            return;
        }
        int sum = a + b;
        System.out.println(sum);
        fib(b, sum, n - 1);
    }
}

// public class FibonacciRecursive {
// // Recursive function to return the nth Fibonacci number
// public static int fib(int n) {
// if (n <= 1)
// return n;
// else
// return fib(n - 1) + fib(n - 2);
// }

// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.print("Enter number of terms: ");
// int n = sc.nextInt();

// System.out.println("Fibonacci Series:");
// for (int i = 0; i < n; i++) {
// System.out.print(fib(i) + " ");
// }
// }
// }