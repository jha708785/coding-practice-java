package string;

import java.util.Arrays;

public class ANAGRAM {

    public static void main(String[] args) {

        String s1="LISTEN";
        String s2="SILENT";

        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        if(c1.length!=c2.length){
            System.out.println("not anagram");
            System.exit(0);
        }
        else {
            System.out.println("anagram");
        }
        Arrays.sort(c1);
        Arrays.sort(c2);

        for (int i=0;i<c1.length;i++){
            if (c1[i]!=c2[i]){
                System.out.println("not anagram");
                System.exit(0);
            }

        }
        System.out.println("angram");


        /*char[] c1 =s1.toCharArray();
        char[] c2 =s2.toCharArray();

        if(c1.length!=c2.length)
        {
            System.out.print("not aragram");
            System.exit(0);
        }
        else {
            System.out.println("anagram");
        }
        Arrays.sort(c1);
        Arrays.sort(c2);

        for(int i=0;i<c1.length;i++)

        {
            if(c1[i]!=c2[i])
            {
                System.out.println("not anagram");
                System.exit(0);
            }

        }
        System.out.println("anagram"); */
    }


}
