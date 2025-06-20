package basic;

public class Tribonasiseries {

    public static void main(String[] args) {

        int a=0,b=1,c=2,d,num=10;

        for (int i=1;i<=num;i++){
            System.out.print(a);
            d=a+b+c;
            a=b;
            b=c;
            c=d;
        }
    }
}
