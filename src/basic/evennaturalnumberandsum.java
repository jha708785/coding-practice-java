package basic;

public class evennaturalnumberandsum {

    public static void main(String[] args) {
        int sum=0;
        int num=10;
        for(int i=1;i<=num;i++){
            if(i%2==0){

                System.out.print(i);
                sum+=i;
            }
        }
        System.out.println(sum);
    }
}
