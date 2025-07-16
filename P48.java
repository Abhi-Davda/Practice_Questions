
// Write a program to merge two arrays into one, but if any element is repeated in the arrays, it should appear only once, and the duplicates should be replaced with zeros.
// Input: Enter the size of first array: 4 ; Enter the elements of first array: 7 2 5 9 
// Enter the size of second array: 5 ; Enter the elements of second array: 5 9 3 7 8 
// Output: Merged array: 7 2 5 9 0 0 3 0 8
import java.util.Scanner;

public class P48 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of 1st array");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("enter elements: ");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Enter size of 2nd array");
        int m = sc.nextInt();
        int b[] = new int[m];
        System.out.println("enter elements: ");
        for (int i = 0; i < b.length; i++) {
            b[i] = sc.nextInt();
        }

        int c[] = new int[n + m];

        for (int i = 0; i < a.length; i++) {
            c[i] = a[i];
        }
        for (int i = 0; i < b.length; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < n; j++) {
                if (c[j] == b[i]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (isDuplicate) {
                c[n + i] = 0;
            } else {
                c[n + i] = b[i];
            }
        }
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i] + " ");
        }
        sc.close();
    }
}
