package dsa;
public class LargestAndSmallest {

    public static void minandmax(int[] arr){
        int min=arr[0];
        int max = arr[0];

        for (int i=0;i<arr.length;i++){
            if (arr[i]<min){
                min=arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
    }
}
