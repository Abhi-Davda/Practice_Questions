
// WAP to enter an element at specific position into array. (Do not take a new array)
import java.util.Scanner;

public class P16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter No.");
        int n = sc.nextInt();
        System.out.println("Enter Position:");
        int p = sc.nextInt();
        System.out.println("Enter No. of Elements to Add:");
        int b = sc.nextInt();
        System.out.println("---Enter elements in array---");
        int a[] = new int[b + 1];
        for (int i = 0; i < b; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("-------");
        for (int i = b; i >= p; i--) {
            a[i] = a[i - 1];
        }
        a[p - 1] = n;
        for (int i : a) {
            System.out.println("Element-->" + i);
        }
        sc.close();
    }
}