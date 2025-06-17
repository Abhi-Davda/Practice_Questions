
// WAP to find a summation of a digit of a given number. (Iterative and recursive)
import java.util.Scanner;

public class P3 {
    static int b, s = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Iterative
        System.out.println("Enter No.");
        int n = sc.nextInt();
        int c = n;
        int sum = 0;
        int a;
        while (n > 0) {
            a = n % 10;
            sum += a;
            n = n / 10;
        }
        System.out.println("SUM = " + sum);

        // Recursive
        int sum1 = Summation(c);
        System.out.println("SUM_R = " + sum1);

        sc.close();
    }

    static int Summation(int n) {
        if (n <= 0) {
            return s;
        } else {
            b = n % 10;
            s += b;
            Summation(n / 10);
            return s;
        }
    }
}
