package dsa;

public class checkgreater {

   public static int check(int[]arr, int x){
       int count=0;
       for (int i=0;i<arr.length;i++){
           if (arr[i]>x){
               count++;
           }
       }
       return count;
   }
    public static void main(String[] args) {

        int[] arr={5,6,7,8,9};
        int x=6;
        int count=check(arr,x);

        System.out.println(count);

        //kitne greater hai


    }
}
