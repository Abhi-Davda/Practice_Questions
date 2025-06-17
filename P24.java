// WAP to sort an Array using Counting sort.

public class P24 {
    public static void main(String[] args) {
        int a[] = { 4, 2, 2, 8, 3, 3, 1 };
        int max = a[0];
        for (int val : a) {
            if (val > max) {
                max = val;
            }
        }

        int count[] = new int[max + 1];

        for (int val : a) {
            count[val]++;
        }

        int ind = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                a[ind++] = i;
                count[i]--;
            }
        }

        for (int val : a) {
            System.out.println(val);
        }
    }
}
