// Given two arrays a[]and b[],the task is to find the intersection of the two arrays.Intersection of two arrays is said to be elements that are common in both arrays.
// The intersection should not count duplicate elements and the result should contain items in any order.
// Input:a[]={1,2,1,3,1},b[]={3,1,3,4,1} ; Output:{1,3} ; Explanation:1 and 3 are the only common elements and we need to print only one occurrence of common elements.
// Input:a[]={1,1,1},b[]={1,1,1,1,1} ; Output:{1} ; Explanation:1 is the only common element present in both the arrays.
// Input:a[]={1,2,3},b[]={4,5,6} ; Output:{}Explanation:No common element in both the arrays.

import java.util.HashSet;
import java.util.Scanner;

public class P62 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of 1st array:");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("enter elements:");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("enter size of 2nd array:");
        int m = sc.nextInt();
        int b[] = new int[m];
        System.out.println("enter elements:");
        for (int i = 0; i < b.length; i++) {
            b[i] = sc.nextInt();
        }
        HashSet<Integer> Intersection = new HashSet<>();
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    Intersection.add(a[i]);
                }
            }
        }
        System.out.println("Intersection elements : ");
        for (int i : Intersection) {
            System.out.print(i + " ");
        }
        sc.close();
    }
}
