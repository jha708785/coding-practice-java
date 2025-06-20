package basic;

public class primenumbercheck {
    public static void main(String[] args) {
        int count=0;
        int n=3;

        for (int i=1;i<=n;i++){
            if(n%i==0){
                count++;
            }
        }
        if (count==2){
            System.out.println("prime number");
            System.out.println(count);

        }
        else {
            System.out.println("not prime number");
        }
    }
}
