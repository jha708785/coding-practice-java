package basic;

public class pelindrome {

    public static void main(String[] args) {
        int r;
        int sum = 0;
        int num = 121;
        int c;

        c=num;

        while (num>0){
            r=num%10;
            sum=(sum*10)+r;
            num=num/10;
            System.out.print(r);

        }
        System.out.println();


        if (c==sum){
            System.out.println("palindrome");
        }
        else {
            System.out.println("not paindrome");
        }

    }
}