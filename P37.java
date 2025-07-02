// Given a number n then print n terms of fibonacci series in reverse order.
// Input : n = 5 
// Output : 3 2 1 1 0

import java.util.Scanner;

public class P37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n :");
        int n = sc.nextInt();
        String fib = "";
        int a = 0;
        int b = 1;
        int sum = 0;
        fib += a;
        fib += b;
        for (int i = 0; i < n - 2; i++) {
            sum = a + b;
            a = b;
            b = sum;
            fib += sum;
        }
        for (int i = fib.length() - 1; i >= 0; i--) {
            System.out.print(fib.charAt(i) + " ");
        }
        sc.close();
    }
}
