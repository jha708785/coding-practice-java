package Recursion;

public class Armstrong {

    static int arm(int n){
        if (n < 10)
            return n*n*n; // last digit ka cube
        return (n%10)*(n%10)*(n%10) + arm(n/10); // cube of last digit + remaining digits
    }

    public static void main(String[] args) {

        int num=153;
         int r=arm(num);

         if (num==r){
             System.out.println("is armstrong");
         }
         else {
             System.out.println("not armstrong");
         }
    }
}
