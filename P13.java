// WAP to sort an Array using Bubble sort.
public class P13 {
    public static void main(String[] args) {
        int a[] = { 5, 6, 1, 3 };
        int temp;
        int swp = 0;
        int n = a.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    swp++;
                }
            }
            if (swp == 0) {
                System.out.println("Already Sorted");
                break;
            }
        }
        System.out.println("______Answer______");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
