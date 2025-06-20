package basic;

public class printprimenumber {

    static boolean isPrime(int n){

        if(n==1||n==0)
            return false;
        for(int i=2; i<=n/2; i++){
            if(n%i==0)
                return false;
        }

        return true;
    }
    public static void main (String[] args)
    {
        int N = 100;

        if (isPrime(9)){
            System.out.println("prime number");
        }
        else {
            System.out.println("not prime number");
        }

        for(int i=1; i<=N; i++){

            if(isPrime(i)) {
                System.out.print(i + " ");
            }
        }

    }
}
