package dsa;

import java.util.HashSet;

public class FindFirstRepetednumber {

    public static int firstRepeated(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return arr[i]; // first repeated
                }
            }
        }
        return -1; // no repeated element
    }

    public static int firstRepeateds(int[] arr) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : arr) {
            if (set.contains(num)) {
                return num;
            }
            set.add(num);
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 1};
        System.out.println(firstRepeated(arr));
    }
}
