
// Given two sorted arrays of sizes m and n respectively, the task is to find the element that would be at the k-th position in the final sorted array formed by merging these two arrays.
// Input: a[] = [2, 3, 6, 7, 9], b[] = [1, 4, 8, 10], k = 5 Output: 6 Explanation: The final sorted array is [1, 2, 3, 4, 6, 7, 8, 9, 10] The 5th element is 6.
// Input: a[] = [100, 112, 256, 349, 770], b[] = [72, 86, 113, 119, 265, 445, 892], k = 7 Output: 256 Explanation: The final sorted array is [72, 86, 100, 112, 113, 119, 256, 265, 349, 445, 770, 892]. The 7th element is 256.
import java.util.Arrays;
import java.util.Scanner;

public class P31 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of 1st Array");
        int n = sc.nextInt();
        int a[] = new int[n];

        System.out.println("Enter size of 2nd Array");
        int m = sc.nextInt();
        int b[] = new int[m];

        System.out.println("Enter Elements of 1st Array");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Enter Elements of 2nd Array");
        for (int i = 0; i < b.length; i++) {
            b[i] = sc.nextInt();
        }

        System.out.println("Enter value of K");
        int k = sc.nextInt();

        int c[] = new int[m + n];
        for (int i = 0; i < n; i++) {
            c[i] = a[i];
        }
        for (int i = 0; i < m; i++) {
            c[n + i] = b[i];
        }
        Arrays.sort(c);
        for (int i = 0; i < c.length; i++) {
            if (i == (k - 1)) {
                System.out.println("Element is :" + c[i]);
            }
        }
        sc.close();
    }
}