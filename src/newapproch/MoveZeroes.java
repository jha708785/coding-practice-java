package newapproch;

import java.util.Arrays;

public class MoveZeroes {
    public static void moveZeroes(int[] nums) {
        int j = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }
    }

    static void main() {
        int[] srr={1,2,0,0,0};
        moveZeroes(srr);
        System.out.println(Arrays.toString(srr));

    }
}