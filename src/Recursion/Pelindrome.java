package Recursion;

public class Pelindrome {

    static  int pal(int n,int sum){

        if (n==0)
            return sum;
            sum=sum*10+n%10;
            return  pal(n/10,sum);


    }

    public static void main(String[] args) {

    }
}
