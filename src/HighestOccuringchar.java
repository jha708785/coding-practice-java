public class HighestOccuringchar {

    public static char highestoccuringchar(String str){

        int[] arr=new int[256];

        for (int i=0;i<str.length();i++){
            arr[str.charAt(i)]+=1;
        }
        int max=-1;
        char c=' ';

        for (int i=0;i<str.length();i++){
            if (max<arr[str.charAt(i)]){
                max=arr[str.charAt(i)];
                c=str.charAt(i);
            }
        }
        return c;
    }

    public static void main(String[] args) {

        String str="sumit kumar jha";
        System.out.println(highestoccuringchar(str));
    }
}
