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

    public static void main(String[] args) {

        int[] arr={1,5,5,5,5,5};
        int x=5;
        int count= lastindex(arr,x);
        System.out.println(count);
    }
}
