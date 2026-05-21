package arrays;

import java.util.Arrays;

public class MergeSortedTwoArray {

    static void main() {

        int[] a = {9, 2, 3, 4, 5, 6};
        int[] b = {3, 4, 5, 6, 7, 8};
        Arrays.sort(a);
        Arrays.sort(b);

        int[] c = new int[a.length + b.length];


        for (int i = 0; i < a.length; i++) {
            c[i] = a[i];
        }

        for (int i = 0; i < b.length; i++) {
            c[i + a.length] = b[i];
        }

        System.out.println(Arrays.toString(c));
    }
}
