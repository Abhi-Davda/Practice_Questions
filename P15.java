// WAP to sort an Array using selection sort.
public class P15 {
    public static void main(String[] args) {
        int a[] = { 5, 6, 1, 3 };

        for (int i = 0; i < a.length; i++) {
            int min = i;
            for (int j = i + 1; j < a.length; j++)
                if (a[j] < a[min]) {
                    min = j;
                }
            int temp = a[min];
            a[min] = a[i];
            a[i] = temp;
        }

        System.out.println("______Answer______");
        for (int n : a) {
            System.out.println(n);
        }
    }
}
