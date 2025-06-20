package basic;

public class Foobiniciseries {

    public static void main(String[] args) {

        int a=0,b=1,c;
        int num=10;

        for (int i=1;i<=num;i++){
            System.out.print(a+" ");
            c=a+b;
            a=b;
            b=c;
        }
    }
}
