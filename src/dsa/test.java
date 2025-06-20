package dsa;

public class test {

    public static int[] s(int[] arr,int target)
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]+arr[j]==target)
                {
                    return  new int[] {i,j};
                }
            }
        }
        return new int[] {};
    }
    public static void main(String[] args) {
        int[] arr= {1,2,3,4,5};
        int target=6;
        int[] s = s(arr, target);


        if (s.length==2) {
            System.out.println(s[0]+" "+s[1]);
        }
    }

}
