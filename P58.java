// Given an integer array arr[] containing digits from [0, 9], the task is to print all possible letter combinations that the numbers could represent. A mapping of digits to letters (just like on the telephone buttons) is being followed. Note that 0 and 1 do not map to any letters. All the mapping are shown in the image below:
// Input: arr[] = [2, 3] ; Output: ad ae af bd be bf cd ce cf ; Explanation: When we press 2,3 then ad, ae, af, bd, … cf are the list of possible words.
// Input: arr[] = [5] ; Output: j k l

import java.util.*;

public class P58 {
    public static void main(String[] args) {
        int[] arr = { 2, 3 }; // Example input
        List<String> combinations = getLetterCombinations(arr);

        for (String s : combinations) {
            System.out.print(s + " ");
        }
    }

    public static List<String> getLetterCombinations(int[] digits) {
        Map<Integer, String> map = new HashMap<>();
        map.put(2, "abc");
        map.put(3, "def");
        map.put(4, "ghi");
        map.put(5, "jkl");
        map.put(6, "mno");
        map.put(7, "pqrs");
        map.put(8, "tuv");
        map.put(9, "wxyz");

        List<String> result = new ArrayList<>();
        result.add(""); // Start with an empty combination

        for (int digit : digits) {
            String letters = map.get(digit);
            if (letters == null)
                continue; // Skip 0 or 1

            List<String> temp = new ArrayList<>();

            for (String combination : result) {
                for (char ch : letters.toCharArray()) {
                    temp.add(combination + ch);
                }
            }

            result = temp; // Move to next digit's combinations
        }

        // If original input was empty or only contained 0/1
        if (result.size() == 1 && result.get(0).equals("")) {
            return new ArrayList<>();
        }

        return result;
    }
}

// Initialize result = [""]

// For each digit in arr, get its letter mapping (e.g., 2 → abc, 3 → def)

// For each existing combination in result, append each letter for the current digit, building a new list.

// Replace result with the new list after processing each digit.