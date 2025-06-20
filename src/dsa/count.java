package dsa;

public class count {

    public  static int countoccurence(int[] arr,int x){
        int count=0;
        for (int i=0;i<arr.length;i++){
            if (arr[i]==x){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {

        int[] arr={1,1,1,2,3,4,5,6};
        int x=1;
        int count =countoccurence(arr,x);
        System.out.println(count);

        //1 kite  baar aya hai

    }
}
