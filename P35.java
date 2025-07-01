
// Find the difference between the second largest element and the second smallest element of an array.
// Input : Enter the size of array: 7 Enter 7 elements: 5 1 9 7 1 5 3 Output: Difference: 4
import java.util.Scanner;

public class P35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of array:");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter Elements");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int l = a[0], s = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] > l) {
                l = a[i];
            }
            if (a[i] < s) {
                s = a[i];
            }
        }
        int sl = a[0], ss = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] > sl) {
                if (a[i] < l) {
                    sl = a[i];
                }
            }
            if (a[i] < ss) {
                if (a[i] > s) {
                    ss = a[i];
                }
            }
        }
        int dif = sl - ss;
        System.out.println("Difference : " + dif);
        sc.close();
    }

}
