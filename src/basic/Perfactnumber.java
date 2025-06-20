package basic;

public class Perfactnumber {

    public static void main(String[] args) {

        int sum=0;
        int num=15;

        for (int i=1;i<num;i++){
            if (num%i==0){

                sum=sum+i;
            }
        }

        if (num==sum){
            System.out.println("perfact");
        }
        else {
            System.out.println("not perfact");
        }
    }
}
