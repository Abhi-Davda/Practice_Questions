
// WAP to convert a Binary to Decimal.
import java.util.Scanner;

public class P19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Binary Value:");
        int n = sc.nextInt();
        int m = n;
        int sum = 0;
        int x = 1;
        int count = 0;
        while (n > 0) {
            count++;
            n = n / 10;
        }
        for (int i = 0; i < count; i++) {
            int a = m % 10;
            for (int j = 0; j < i; j++) {
                x *= 2;
            }
            sum += (x * a);
            x = 1;
            m = m / 10;
        }
        System.out.println("Decimal val:" + sum);
        sc.close();
    }
}

// public class BinaryToDecimal {
// public static void main(String[] args) {
// String binary = "1011";
// int decimal = 0;

// int length = binary.length();
// for (int i = 0; i < length; i++) {
// char bit = binary.charAt(length - 1 - i);
// if (bit == '1') {
// decimal += Math.pow(2, i);
// }
// }

// System.out.println("Decimal: " + decimal);
// }
// }