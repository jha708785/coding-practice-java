package dsa;

import java.util.Arrays;

public class Removeduplicate{

    public static void main(String[] args) {

        int[] arr={1,2,3,4,1,2};

        Arrays.sort(arr);
        int[] newarray=new int[arr.length];
        int j=0;

        for (int i=0;i<arr.length-1;i++){
            if (arr[i]!=arr[i+1]){
                newarray[j]=arr[i];
                j++;
            }
        }
       newarray[j]=arr[arr.length-1];
        for (int i=0;i<newarray.length-1;i++){
            System.out.print(newarray[i]);
        }
    }
}
