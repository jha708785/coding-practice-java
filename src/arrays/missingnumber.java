package arrays;

public class missingnumber {

    public static void main(String[] args) {

        int[] a={1,2,4,5,6};

        int exp=a.length+1;

        int totalsum=exp*(exp+1)/2;

        int sum=0;

        for (int i=0;i<a.length;i++){
            sum=sum+a[i];
        }
        System.out.println(totalsum-sum);
    }
}
