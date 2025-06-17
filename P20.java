// WAP to convert a Decimal to Binary.
public class P20 {
    public static void main(String[] args) {
        int n = 11;
        String binary = "";
        while (n > 0) {
            int r = n % 2;
            binary = r + binary;
            n /= 2;
        }
        System.out.println("Binary val: " + binary);
    }
}
