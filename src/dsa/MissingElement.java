package dsa;

import java.util.Arrays;

public class MissingElement {
    static void main() {
        int[] arr = {1, 2, 6};
        Arrays.sort(arr);
        int max = arr[arr.length - 1];
        int sum=0;

        for (int i = 1; i <= max; i++) {
            boolean found = false;
            for (int num : arr) {
                if (num == i) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println("Missing number: " + i);
            }
        }
    }
    }

