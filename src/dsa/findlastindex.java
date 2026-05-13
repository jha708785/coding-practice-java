package dsa;

public class findlastindex {

    public static int lastindex(int[] arr,int x){

        int lastindex=-1;

        for (int i=0;i<arr.length;i++){
            if (arr[i]==x){
                lastindex=i;
            }
        }
        return lastindex;
    }

    public  static  int firstindex(int[] arr,int x){
        int firstindex=-1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                firstindex = i;
                break;
            }
        }
        return firstindex;
    }

    public static void main(String[] args) {

        int[] arr={1,5,5,5,5,5};
        int x=5;
        int count= lastindex(arr,x);
       int co =firstindex(arr,x);
        System.out.println(count);
        System.out.println(co);
    }
}
