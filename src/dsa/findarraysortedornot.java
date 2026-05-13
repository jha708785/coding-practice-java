package dsa;
public class findarraysortedornot {
    public static boolean isSorted(int[] arr){
        boolean issorted=true;

        for (int i=1;i<arr.length;i++){
            if(arr[i]<arr[i-1]){
                issorted=false;
                break;
            }
        }
        return issorted;
    }
}
