package arrays;

public class arrange
{
    public static void main(String[] args) {
        int[] arr={1,0,1,0,1};
        int[] newarr=new int[arr.length];
        rerrange(arr,newarr);
        printd(newarr);

    }

    private static void rerrange(int[] arr, int[] newarr) {
        int j=0;
        for (int i=0;i<arr.length;i++){
            if (arr[i]==0){
                newarr[j]=arr[i];
                j++;
            }
        }
        for (int i=0;i<arr.length;i++){
            if (arr[i]!=0){
                newarr[j]=arr[i];
                j++;
            }
        }
    }

    private static void printd(int[] arr){
        for (int p:arr){
            System.out.print(p+" ");
        }
    }
}
