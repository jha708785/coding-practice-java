package basic;

public class oddnumber {

    public static void main(String[] args) {

        int num=15;
        for (int i=1;i<=num;i=i+2){
            if(num%i!=0){
                System.out.print(i);
            }
        }
    }
}
