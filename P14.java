// WAP to sort an Array using insertion sort.
public class P14 {
    public static void main(String[] args) {
        int a[] = { 5, 6, 1, 3 };
        for (int i = 1; i < a.length; i++) {
            int key = a[i];
            int j;
            for (j = i - 1; j >= 0 && a[j] > key; j--) {
                a[j + 1] = a[j];
            }
            a[j + 1] = key;
        }

        System.out.println("______Answer______");
        for (int n : a) {
            System.out.println(n);
        }
    }
}
