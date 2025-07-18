// Given a string that contains both upper and lower case characters in it.The task is to count a number of upper and lower case characters in it.
// Input:Introduction to Python 
// Output:Lower Case characters:18 
// Upper case characters:2 
// Input:Welcome to GeeksforGeeks 
// Output:Lower Case characters:19 
// Upper case characters:3

import java.util.Scanner;

public class P52 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String: ");
        String str = sc.nextLine();
        int upperCnt = 0, lowerCnt = 0;
        for (int i = 0; i < str.length(); i++) {
            int c = str.charAt(i);
            if (c <= 90 && c >= 65) {
                upperCnt++;
            } else if (c <= 122 && c >= 97) {
                lowerCnt++;
            }
        }
        System.out.println("Upper case char: " + upperCnt);
        System.out.println("Lower case char: " + lowerCnt);
        sc.close();
    }
}
