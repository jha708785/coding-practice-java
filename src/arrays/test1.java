package arrays;

import java.util.Arrays;

public class test1 {

    public static void main(String[] args) {

        int[] arr={1,2,3,4,1,2};
        Arrays.sort(arr);
        int[] newArr=new int[arr.length];
        int j=0;
        for (int i=0;i<arr.length-1;i++){
            if (arr[i]!=arr[i+1]){
                newArr[j]=arr[i];
                j++;
            }
        }
        newArr[j]=arr[arr.length-1];
        for(int i=0;i<newArr.length;i++) {
            System.out.print(newArr[i]+"");
        }
    }
}
