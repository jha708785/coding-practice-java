package arrays;

public class test {

    public static void main(String[] args) throws Exception {

       try {
           int[] arr={1,2,3,4,5};
           try {
               int x=arr[2]/arr[3];
           }
           catch (ArithmeticException e){
               e.printStackTrace();
           }
           arr[12]=12;
       }
       catch (ArrayIndexOutOfBoundsException e){
           e.printStackTrace();
       }
       throw  new Exception(" ");
    }
}
