package arrays;

public class findevenposition {
    public static void main(String[] args) {

        int[] a=new int[]{1,2,3,4,5,6,7};

        for (int i=2;i<a.length;i=i+2){
            System.out.print(a[i]);
        }
    }
}
