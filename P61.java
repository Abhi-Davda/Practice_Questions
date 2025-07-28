// Write a program to reverse the elements of an array without using a temporary array.
// Input:Enter the number of elements in the array:5 
// 1 2 3 4 5 
// Output:Reversed array:5 4 3 2 1

import java.util.Scanner;

public class P61 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array:");
        int n = sc.nextInt();

        int a[] = new int[n];
        System.out.println("enter elements");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        int b = a.length / 2;
        int j = 0;
        while (b > 0) {
            int temp = a[j];
            a[j] = a[(n - 1) - j];
            a[(n - 1) - j] = temp;
            j++;
            b--;
        }
        System.out.println("Reversed array:");
        for (int i : a) {
            System.out.print(i + " ");
        }

        sc.close();
    }
}
