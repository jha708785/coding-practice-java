package dsa;
public class MejorityElementinArray {

    public static  int mejority(int[] arr){

        int count=0;
        int cand=0;

        for (int i=0;i<arr.length;i++){
            if (count == 0) {
                cand=arr[i];
            }
            if (cand==arr[i]){
                count++;
            }
            else {
                count--;
            }
        }
        return cand;
    }

    public static void main(String[] args) {
        int[] arr={1,2,2,2,2,3,4,1,1};
        System.out.println(mejority(arr));
    }
}
