package arrays;

import java.util.HashSet;

public class first_duplicate {
    public static void re(int[] arr){
        for (int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if (arr[i]==arr[j]){
                    //return arr[i];
                    System.out.println(arr[i]);
                    return;
                }
            }
        }
        //return  -1;
    }

    public static void findFirstDuplicate(int[] arr) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : arr) {
            if (!set.add(num)) {
                System.out.println("First duplicate: " + num);
                return;
            }
        }

        System.out.println("No duplicates found");
    }
    static void main() {
     int[] arr={1,2,3,4,1};
        re(arr);
    }

}
