
//  WAP to find a prime number between range (range should be entered by user).
import java.util.Scanner;

public class P10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Start No.");
        int a = sc.nextInt();
        System.out.println("Enter End No.");
        int b = sc.nextInt();
        int cnt = 0;
        for (int i = a; i <= b; i++) {
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    cnt++;
                    break;
                }
            }
            if (cnt == 0 && i != 1 && i != 0) {
                System.out.println("PRIME NO: " + i);
            }
            cnt = 0;
        }
        sc.close();

    }
}
