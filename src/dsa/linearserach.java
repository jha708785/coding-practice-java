package dsa;

public class linearserach {

    public static  int leanersearch(int[] arr,int search){
        for (int i=0;i<arr.length;i++){
            if (arr[i]==search){
                //return i;
                System.out.println(arr[i]);
                break;
            }

        }
        return -1;
    }

    static void main() {
        int[] arr={1,2,3,4,5};
        int serach=4;
        leanersearch(arr,serach);
    }
}
