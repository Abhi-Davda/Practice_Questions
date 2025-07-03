// Given a string S and a character ‘c’, the task is to count the occurrence of the given character in the string.
// Input: S = “geeksforgeeks” and c = ‘e’ Output: 4 Explanation: ‘e’ appears four times in str. 
// Input: S = “abccdefgaa” and c = ‘a’ Output: 3 Explanation: ‘a’ appears three times in str.

import java.util.Scanner;

public class P40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String :");
        String s = sc.nextLine();
        System.out.println("Enter Character :");
        char c = sc.next().charAt(0);
        int cnt = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                cnt++;
            }
        }
        System.out.println("Count :" + cnt);
        sc.close();
    }
}
