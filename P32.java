// Given two strings s1 and s2 consisting of lowercase characters, the task is to check whether the two given strings are anagrams of each other or not. An anagram of a string is another string that contains the same characters, only the order of characters can be different.
// Input: s1 = “geeks” s2 = “kseeg” Output: true Explanation: Both the strings have the same characters with same frequency. So, they are anagrams.
// Input: s1 = “allergy” s2 = “allergic” Output: false Explanation: Characters in both the strings are not the same. s1 has extra characters ‘y’ and s2 has extra characters ‘i’ and ‘c’, so they are not anagrams.

import java.util.Scanner;

public class P32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st String :");
        String s1 = sc.nextLine();
        System.out.println("Enter 2nd String :");
        String s2 = sc.nextLine();

        int cnt1 = 0, cnt2 = 0;

        boolean output = true;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.length() != s2.length()) {
                output = false;
                break;
            }
            for (int j = 0; j < s1.length(); j++) {
                if (s1.charAt(i) == s2.charAt(j)) {
                    cnt2++;
                }
            }
            for (int k = 0; k < s1.length(); k++) {
                if (s1.charAt(i) == s1.charAt(k)) {
                    cnt1++;
                }
            }
            if (cnt1 != cnt2) {
                output = false;
                break;
            }
        }
        System.out.println(output);
        sc.close();
    }
}
