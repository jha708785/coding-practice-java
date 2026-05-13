package arrays;
public class FirstDuplicate {

    static void main() {
        int[] arr={1,2,3,4,5,6,1,2,3,4};
        for (int i=0;i<arr.length;i++){
            boolean unique=true;
            for (int j=0;j<arr.length;j++){
                if(arr[i]==arr[j]&&i!=j){
                    unique =false;
                    break;

                }
            }
            if (!unique){
                System.out.println(arr[i]);
                break;
            }
        }
    }
}
