package arrays;

public class arrange
{
    public static void main(String[] args) {

        int[] arr={-1,-3,4,6,-5};
        int[] newarray=new int[arr.length];
        rerrange(arr,newarray);
        printd(newarray);
    }

    private static void printd(int[] newarray) {
        for (int i:newarray){
            System.out.print(i);
        }
    }

    private static void rerrange(int[] arr, int[] newarray) {

        int j=0;

        for (int i=0;i<arr.length;i++){
            if (arr[i]<0){
                newarray[j]=arr[i];
                j++;
            }
        }

        for (int i=0;i<arr.length;i++){
            if (arr[i]>0){
                newarray[j]=arr[i];
                j++;
            }
        }
        //printd(newarray);
    }
}
