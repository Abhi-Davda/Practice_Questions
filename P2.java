
// WAP to find whether string is palindrome or not.
import java.util.Scanner;

public class P2 {
    public static void main(String[] args) {
        String a, b = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String:");
        a = sc.nextLine();
        for (int i = (a.length() - 1); i >= 0; i--) {
            b += a.charAt(i);
        }

        if (a.equals(b)) {
            System.out.println("String is Palindrome");
        }
        sc.close();
    }
}
