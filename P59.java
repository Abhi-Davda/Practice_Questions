// Given an array of integers arr[]of size n,the task is to rotate the array elements to the left by d positions.
// Input:arr[]={1,2,3,4,5,6},d=2 ; Output:{3,4,5,6,1,2}
// Explanation:After first left rotation,arr[]becomes{2,3,4,5,6,1},
// After the second rotation,arr[]becomes{3,4,5,6,1,2}
// Input:arr[]={1,2,3},d=4 ; Output:{2,3,1}

import java.util.Scanner;

public class P59 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("enter Elements");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("enter no. of rotation in array: ");
        int d = sc.nextInt();
        while (d > 0) {
            for (int i = 0; i < a.length - 1; i++) {
                int temp = a[i];
                a[i] = a[i + 1];
                a[i + 1] = temp;
            }
            d--;
        }
        System.out.println("Final array:");
        for (int i : a) {
            System.out.print(i + " ");
        }

        sc.close();
    }
}
