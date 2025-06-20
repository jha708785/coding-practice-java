package arrays;

public class finduniquearray {

    public static void main(String[] args) {

        int[] arr={1,2,3,4,1,2,3};

        for (int i=0;i<arr.length;i++){
            boolean unique=true;

            for (int j=0;j<arr.length;j++){
                if (arr[i]==arr[j]&& i!=j){
                    unique=false;
                }
            }
            if (unique){
                System.out.println(arr[i]);
                break;
            }
        }
    }
}
