// WAP to sort an Array using Radix sort.
public class P23 {
    public static void main(String[] args) {
        int a[] = { 170, 45, 75, 90, 802, 24, 2, 66 };
        int max = a[0];
        for (int val : a) {
            if (val > max) {
                max = val;
            }
        }
        int cnt = 0;
        while (max > 0) {
            cnt++;
            max /= 10;
        }

        // my Logic...
        for (int exp = 10; cnt > 0; exp *= 10) {
            rSort(a, exp);
            cnt--;
        }
        for (int val : a) {
            System.out.println(val);
        }
    }

    static void rSort(int a[], int exp) {
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if ((a[i] % exp) > (a[j] % exp)) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
    }
}

// // A function to get the maximum value in the array
// public static int getMax(int[] arr) {
//     int max = arr[0];
//     for (int val : arr) {
//         if (val > max)
//             max = val;
//     }
//     return max;
// }

// // A function to perform counting sort based on the digit (exp)
// public static void countingSort(int[] arr, int exp) {
//     int n = arr.length;
//     int[] output = new int[n]; // output array
//     int[] count = new int[10]; // for digits 0-9

//     // Count occurrences of each digit
//     for (int i = 0; i < n; i++) {
//         int digit = (arr[i] / exp) % 10;
//         count[digit]++;
//     }

//     // Convert count[i] so that it contains the position of this digit in output[]
//     for (int i = 1; i < 10; i++) {
//         count[i] += count[i - 1];
//     }

//     // Build output[] using the count array (must go right to left for stability)
//     for (int i = n - 1; i >= 0; i--) {
//         int digit = (arr[i] / exp) % 10;
//         output[count[digit] - 1] = arr[i];
//         count[digit]--;
//     }

//     // Copy sorted elements back into original array
//     System.arraycopy(output, 0, arr, 0, n);
// }

// // Main radix sort function
// public static void radixSort(int[] arr) {
//     int max = getMax(arr);

//     // Sort based on every digit (unit, ten, hundred, etc.)
//     for (int exp = 1; max / exp > 0; exp *= 10) {
//         countingSort(arr, exp);
//     }
// }
