// WAP to find a power a^b (without using power and multiplication operation).
// Mathematically,a^b means multiplying a by itself b times.
public class P27 {
    public static void main(String[] args) {
        System.out.println(power(2, 5));
    }

    static int power(int a, int b) {
        int result = 1;
        for (int i = 0; i < b; i++) {
            result = multiply(result, a);
        }
        return result;
    }

    static int multiply(int a, int b) {
        int result = 0;
        for (int i = 0; i < b; i++) {
            result += a;
        }
        return result;
    }

}
