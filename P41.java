
// Find if a given string can be represented from a substring by iterating the substring “n” times.
// Input: str = "abcabcabc" Output: true
// Input: str = "aabaabaabaab" Output: true
// Input: str = "abcdabc" Output: false
import java.util.Scanner;

public class P41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String : ");
        String s = sc.nextLine();
        int len = s.length();
        String s1 = "";
        boolean isrepeatable = false;
        for (int i = 1; i < len / 2; i++) {
            s1 = s.substring(0, i);

            if (len % i != 0) {
                continue;
            }

            int repeatCount = len / i;
            StringBuffer st = new StringBuffer();

            for (int j = 0; j < repeatCount; j++) {
                st.append(s1);
            }
            if (st.toString().equals(s)) {
                isrepeatable = true;
                break;
            }

        }
        System.out.println("Output: " + isrepeatable);
        sc.close();
    }
}
