package arrays;

public class arrange
{

    private static void print(int[] newarr){
        for (int p:newarr){
            System.out.print(p);
        }
    }

    private static  void rerrange(int[] arr,int[] newarrr){

        int j=0;
        for (int i=0;i<arr.length;i++){
            if (arr[i]==0){
                newarrr[j]=arr[i];
                j++;
            }
        }

        for (int i=0;i<arr.length;i++){
            if (arr[i]!=0){
                newarrr[j]=arr[i];
                j++;
            }
        }
    }

    public static void main(String[] args) {

        int[] arr={1,1,1,1,0,0,0,0};
        int[] newarray=new int[arr.length];
        rerrange(arr,newarray);
        print(newarray);

    }




}
