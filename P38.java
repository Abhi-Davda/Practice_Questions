
// Given an array arr[], the task is to reverse the array. Reversing an array means rearranging the elements such that the first element becomes the last, the second element becomes second last and so on.
// Input: arr[] = {1, 4, 3, 2, 6, 5} 
// Output: {5, 6, 2, 3, 4, 1}
import java.util.Scanner;

public class P38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter Elements:");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        for (int i = a.length - 1; i >= 0; i--) {
            System.out.print(a[i] + " ");
        }
        sc.close();
    }
}
