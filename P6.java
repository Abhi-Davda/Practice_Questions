
// WAP to find a total odd and total even digit of a given number.
import java.util.Scanner;

public class P6 {
    public static void main(String[] args) {
        System.out.println("Enter no.");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sumE = 0, sumO = 0;
        int d;
        while (n > 0) {
            d = n % 10;
            if (d % 2 == 0) {
                sumE++;
            } else {
                sumO++;
            }
            n = n / 10;
        }
        System.out.println("Total Even no. in digit :" + sumE);
        System.out.println("Total Odd no. in digit :" + sumO);

        sc.close();
    }
}
