package string;

public class StringPalindrome {

    public static void main(String[] args) {

        String str="abc";
        StringBuilder s=new StringBuilder(str);
        StringBuilder reverse = s.reverse();

        if(reverse.equals(str))
        System.out.println(" palindrome");
        else
            System.out.println("not palindrome");
    }
}
