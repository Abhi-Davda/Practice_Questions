
// WAP to sort an Array using Bucket sort.
// ::: Steps :::
// Let’s say you want to sort an array of "n" real numbers from 0 to 1.
// Create n empty buckets(lists or arrays).
// Distribute each input element into a bucket based on its value:
//      bucket_index=⌊n×value⌋
// Sort each individual bucket(using Insertion Sort or Java’s built-in sort).
// Concatenate all buckets in order to get the final sorted array.
import java.util.*;

public class P22 {
    public static void main(String[] args) {
        float a[] = { 0.33f, 0.11f, 0.55f, 0.22f, 0.44f };
        int n = a.length;

        List<Float> bucket[] = new List[n];
        for (int i = 0; i < bucket.length; i++) {
            bucket[i] = new ArrayList<Float>();
        }

        for (int i = 0; i < n; i++) {
            int ind = (int) (n * a[i]);
            bucket[ind].add(a[i]);
        }

        // Insertion sort
        for (List<Float> buk : bucket) {
            for (int j = 1; j < buk.size(); j++) {
                float key = buk.get(j);
                int k;
                for (k = j - 1; k >= 0 && buk.get(k) > key; k--) {
                    buk.set(k + 1, buk.get(k));
                }
                buk.set(k + 1, key);
            }
        }

        // for (List<Float> buk : bucket) {
        // Collections.sort(buk);
        // }
        int index = 0;
        for (List<Float> buk : bucket) {
            for (float val : buk) {
                a[index++] = val;
            }
        }

        System.out.println("Sorted array: " + Arrays.toString(a));
    }
}
