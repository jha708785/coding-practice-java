package arrays;

public class secondlargest {

    public static void main(String[] args) {

        int[] arr={1,10,2,3,4,5,6,7,8,9};

        for (int i=0;i<arr.length-1;i++)
        {
            for (int j=i+1;j<arr.length;j++)
            {
                if (arr[i]<arr[j])
                {
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }

        }
        int min = arr[arr.length - 2];
        System.out.println(min);
        System.out.println("first"+" " + arr[0] +" second "+" "+arr[1]);
    }
}
