
// WAP to find weather given number is Armstrong number is not.
import java.util.Scanner;

public class P11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter No.");
        int n = sc.nextInt();
        int a = n;
        int b = n;
        int cnt = 0;
        int x = 1;
        int sum = 0;

        while (b > 0) {
            cnt++;
            b = b / 10;
        }

        while (n > 0) {
            int y = n % 10;
            for (int i = 0; i < cnt; i++) {
                x *= y;
            }
            sum += x;
            x = 1;
            n = n / 10;
        }

        if (sum == a)
            System.out.println("It is a Armstrong No.");
        else
            System.out.println("Not a Armstrong No.");

        sc.close();
    }
}
