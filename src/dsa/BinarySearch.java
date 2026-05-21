package dsa;
import java.util.Arrays;

public class BinarySearch {

    public static int binarySearch(int[] arr, int search) {
        Arrays.sort(arr); // Optional If Array Is Unsorted ...
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left+(right - left) / 2;

            if (arr[mid] == search) {
                return mid;
            } else if (arr[mid] < search) {
                left = mid + 1; // Move Left Pointers
            } else {
                right = mid - 1; // Move Right Pointers
            }
        }
        return -1; // Not Found
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int result = binarySearch(arr, 4);
        System.out.println("Index of 4: " + result);
    }
}