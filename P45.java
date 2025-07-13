
// Find the length of the maximum number of consecutive numbers jumbled up in an array.
// Input: arr[] = {1, 94, 93, 1000, 5, 92, 78}; Output : 3 
// Explanation: The largest set of consecutive elements is 92, 93, 94.
// Input: arr[] = {1, 5, 92, 4, 78, 6, 7}; Output: 4 
// Explanation: The largest set of consecutive elements is 4, 5, 6, 7.
import java.util.Scanner;

public class P45 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        int max = 0;
        for (int i = 0; i < a.length; i++) {
            int count = consecutive(a, a[i]);
            if (count > max) {
                max = count;
            }
        }
        System.out.println("Output: " + max);
        sc.close();
    }

    static int consecutive(int a[], int start) {

        int count = 1;
        int next = start + 1;

        while (true) {
            boolean found = false;
            for (int i = 0; i < a.length; i++) {
                if (a[i] == next) {
                    count++;
                    next++;
                    found = true;
                    break;
                }
            }
            if (!found)
                break;
        }

        return count;
    }
}

// public static int longestConsecutive(int[] arr) {
// HashSet<Integer> set = new HashSet<>();
// for (int num : arr) {
// set.add(num);
// }

// int maxLen = 0;

// for (int num : set) {
// // Only start counting if it's the beginning of a sequence
// if (!set.contains(num - 1)) {
// int current = num;
// int length = 1;

// while (set.contains(current + 1)) {
// current++;
// length++;
// }

// maxLen = Math.max(maxLen, length);
// }
// }

// return maxLen;
// }