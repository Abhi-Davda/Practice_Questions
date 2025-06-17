
// WAP to find whether a number is Odd or Even without using a % operator.
import java.util.Scanner;

public class P9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter No.");
        int n = sc.nextInt();

        System.out.println("_________Type 1_________");
        if ((n / 2) * 2 == n)
            System.out.println("Even");
        else
            System.out.println("Odd");

        System.out.println("_________Type 2_________");
        if ((n & 1) == 0)
            System.out.println("Even");
        else
            System.out.println("Odd");

        sc.close();
    }
}
