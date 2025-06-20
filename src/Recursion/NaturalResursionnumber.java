package Recursion;

public class NaturalResursionnumber {

    static  int natural(int a,int b){
        if(a>b)
            return 1 ;
           System.out.println(a+" ");
            return natural(a+1,b);

        }


    public static void main(String[] args) {

        int a=1;
        int b=12;
        natural(a,b);



    }
}
