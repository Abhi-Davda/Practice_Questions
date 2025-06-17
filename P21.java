// WAP to convert a Decimal number to BCD.
public class P21 {
    public static void main(String[] args) {
        int n = 10;
        String bcd = "";
        String binary = "";
        while (n > 0) {
            int a = n % 10;
            while (a > 0) {
                int r = a % 2;
                binary = r + binary;
                a = a / 2;
            }
            binary = String.format("%4s", binary).replace(' ', '0');
            bcd = binary + " " + bcd;
            binary = "";
            n = n / 10;
        }
        System.out.println("BCD val: " + bcd);

        // BCD to Decimal

        // public class BCDToDecimal {
        // public static void main(String[] args) {
        // // Input: BCD as a string (continuous 0s and 1s, no spaces)
        // String bcd = "000110000101"; // Example: 1 8 5 → 185

        // // Check if BCD is valid (length must be a multiple of 4)
        // if (bcd.length() % 4 != 0) {
        // System.out.println("Invalid BCD input");
        // return;
        // }

        // String decimal = "";

        // // Loop through the string in chunks of 4
        // for (int i = 0; i < bcd.length(); i += 4) {
        // String grp = bcd.substring(i, i + 4); // get 4-bit group
        // int digit = Integer.parseInt(grp, 2); // convert to decimal
        // if (digit > 9) {
        // System.out.println("Invalid BCD digit: " + grp);
        // return;
        // }
        // decimal += digit; // append to result string
        // }

        // System.out.println("Decimal value: " + decimal);
        // }
        // }
    }
}
