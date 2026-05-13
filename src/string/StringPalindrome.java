package string;

public class StringPalindrome {

    public static void main(String[] args) {

        String str="aba";
        str.replace("\\s","").toLowerCase();
        String rev="";


        for (int i=str.length()-1;i>=0;i--){
            rev+=str.charAt(i);
        }
        if (str.equals(rev)){
            System.out.println(" palindrome");
        } else
            System.out.println("not palindrome");

        StringBuilder s=new StringBuilder(str);
        StringBuilder reverse = s.reverse();

        if(reverse.equals(str))
        System.out.println(" palindrome");
        else
            System.out.println("not palindrome");
    }
}
