package basic;

public class aromstrong {
    public static void main(String[] args) {

        int num = 153;
        int arm=0;
        int c;

        c=num;

        while (num>0){
            int rem=num%10;
            arm=(rem*rem*rem)+arm;
            num=num/10;
        }
        if (c==arm){
            System.out.println(" armstromg number");
        }
        else {
            System.out.println("not armstrong nuber");
        }

    }
}
