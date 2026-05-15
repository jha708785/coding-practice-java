package arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicteInarray {

    //find duplicate in first time
    static void main() {
        int[] arr = {1, 2, 3, 1, 2, 3, 4, 5, 5};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[j]);
                    break;
                }
            }
        }

        Set<Integer> set = new HashSet<>();

        Arrays.stream(arr).filter(f->!set.add(f)).forEach(System.out::println);

        for (int n:arr){
            if (!set.add(n)) {
                System.out.println(n);

            }
        }

    }

}
