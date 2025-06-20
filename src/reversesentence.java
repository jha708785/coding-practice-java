public class reversesentence {


    public static String reverse(String str){
        String[] s=str.split(" ");
        String ans="";

        for (int i=s.length-1;i>=0;i--){
            ans=ans+s[i]+" ";
        }
        return ans;
    }

    public static void main(String[] args) {

        String str="this is java"; // java is this
        System.out.println(reverse(str));
        

    }
}
