// public Given a string that contains a special character together with alphabets (‘a’ to ‘z’ and ‘A’ to ‘Z’), reverse the string in a way that special characters are not affected.
// Input: a!!!b.c.d,e'f,ghi Output: i!!!h.g.f,e'd,cba
// Input: str = “Ab,c,de!$” Output: str = “ed,c,bA!$” 

import java.util.Scanner;

public class P44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String:");
        String st = sc.nextLine();
        String rst = "";
        for (int i = st.length() - 1; i >= 0; i--) {
            if (!isSpecial(st.charAt(i))) {
                rst += st.charAt(i);
            }
        }
        String result = "";
        int j = 0;
        for (int i = 0; i < st.length(); i++) {
            if (isSpecial(st.charAt(i))) {
                result += st.charAt(i);
            } else {
                result += rst.charAt(j++);
            }
        }

        System.out.println("Result : " + result);
        sc.close();
    }

    static boolean isSpecial(char c) {
        String str = "!@#$%^&*()-_+/<>\"'[]{}.,\\";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c) {
                return true;
            }
        }
        return false;
    }
}
