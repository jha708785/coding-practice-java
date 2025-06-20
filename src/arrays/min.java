package arrays;

public class min {

    public static void main(String[] args) {

        int arr[]= {1,2,3,4,5,6,6,5,5,4,5,3,5,3,5,3,5,3};

        int min=arr[0];

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<min)
            {
                min=arr[i];
            }
        }
        System.out.println("min value is "+min);

    }
}
