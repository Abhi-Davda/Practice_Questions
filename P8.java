
// WAP to find a Fibonacci series up to n terms (iterative and recursive)
import java.util.Scanner;

public class P8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter No.");
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        int sum = 0;
        int x = n;

        System.out.println("---------Iterative---------");
        System.out.println(a);
        System.out.println(b);
        for (int i = 2; i < n; i++) {
            sum = a + b;
            System.out.println(sum);
            a = b;
            b = sum;
        }

        System.out.println("---------Recursive---------");

        for (int i = 0; i < x; i++) {
            System.out.println(fib(i));
        }

        sc.close();

    }

    static int fib(int n) {
        if (n == 0)
            return 0;
        else if (n == 1 || n == 2)
            return 1;
        else {
            return fib(n - 1) + fib(n - 2);
        }

    }

}
