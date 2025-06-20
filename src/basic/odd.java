package basic;

public class odd {
    public static void main(String[] args) {

        int num=10;
        int sum = 0;
        for (int i=1;i<=num;i++){
            System.out.print(2*i-1);
            sum=sum+(2*i-1);

        }
        System.out.print(sum);
    }
}
