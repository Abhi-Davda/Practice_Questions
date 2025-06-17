
// WAP to find Max, Min, Average of n numbers, n should be taken from user
//  and all n value should be taken from user. 
// (Note that you are not allowed to use an array for this)
import java.util.Scanner;

public class P12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter No.");
        int n = sc.nextInt();
        int max, min;
        int sum = 0;
        int a;

        System.out.println("Enter 1 value:");
        a = sc.nextInt();
        max = a;
        min = a;
        sum = a;

        for (int i = 2; i <= n; i++) {
            System.out.println("Enter " + i + "th value: ");
            a = sc.nextInt();
            if (max < a)
                max = a;
            if (min > a)
                min = a;
            sum += a;
        }

        System.out.println("MAX : " + max);
        System.out.println("MIN : " + min);
        System.out.println("AVG : " + (sum / n));
        sc.close();
    }
}
