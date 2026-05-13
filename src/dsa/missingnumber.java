package dsa;

import java.util.Arrays;

public class missingnumber {

     static void main(String[] args) {
         int[] arr={1,2,6};
        Arrays.sort(arr);
         int sum = 0;
        int max=arr[arr.length-1];

        for (int i=1;i<=max;i++){
            boolean found=false;
            for (int j=0;j<arr.length;j++){
                if (arr[j]==i){
                    found=true;
                    break;
                }
            }
            if (!found){
                System.out.println("Missing: " + i);
                sum += i;

            }

        }
         System.out.println("Sum of missing numbers: " + sum);
    }
}
