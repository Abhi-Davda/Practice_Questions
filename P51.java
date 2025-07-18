
// Given 2 sorted arrays a[] and b[], each of size n, the task is to find the median of the array obtained after merging a[] and b[].
// Input: a[] = [1, 12, 15, 26, 38], b[] = [2, 13, 17, 30, 45] Output: 16 
// Explanation: The middle two elements are 15 and 17, so median = (15 + 17)/2 = 16
import java.util.Scanner;

public class P51 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of 1st Array: ");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter elements: ");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Enter size of 2nd Array: ");
        int m = sc.nextInt();
        int b[] = new int[m];
        System.out.println("Enter elements: ");
        for (int i = 0; i < b.length; i++) {
            b[i] = sc.nextInt();
        }

        int c[] = new int[n + m];
        int i = 0, j = 0, k = 0;
        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                c[k++] = a[i++];
            } else {
                c[k++] = b[j++];
            }
        }
        while (i < a.length) {
            c[k++] = a[i++];
        }
        while (j < b.length) {
            c[k++] = b[j++];
        }

        int elementIndex = 0;
        if (c.length % 2 != 0) {
            elementIndex = c.length / 2;
            for (int r = 0; r < c.length; r++) {
                if (r == elementIndex) {
                    System.out.println("Median = " + (c[r] / 2));
                    break;
                }
            }
        } else {
            elementIndex = c.length / 2;
            for (int r = 0; r < c.length; r++) {
                if (r == elementIndex) {
                    System.out.println("Median = " + ((c[r] + c[r - 1]) / 2));
                    break;
                }
            }
        }
        sc.close();
    }
}