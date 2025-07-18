
// Write a program to sort the numbers in a string expression where numbers are separated by the '+' sign.
//  The program should rearrange the numbers in non-decreasing order while keeping them separated by '+'. 
// Input: 3+2+1 ; Output: 1+2+3
// Input: 1+1+3+1+3 ; Output: 1+1+1+3+3
import java.util.Scanner;

public class P53 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String: ");
        String str = sc.next();
        String a[] = str.split("\\+");

        String output = "";
        int b[] = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            b[i] = Integer.parseInt(a[i]);
        }

        for (int i = 0; i < b.length; i++) {
            for (int j = i + 1; j < b.length; j++) {
                if (b[i] > b[j]) {
                    int temp = b[i];
                    b[i] = b[j];
                    b[j] = temp;
                }
            }
        }

        for (int i = 0; i < b.length; i++) {
            output += b[i];
            if (i != b.length - 1) {
                output += "+";
            }
        }
        System.out.println("Output : " + output);
        sc.close();
    }
}
