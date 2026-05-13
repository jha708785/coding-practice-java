package arrays;
public class FindDuplicteInarray {

    //find duplicate in first time
    static void main() {
        int[] arr={1,2,3,1,2,3,4,5,5};
        for (int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    System.out.println(arr[j]);
                    break;
                }
            }
        }
    }


}
