package string;

public class spaceCount {
    public static void main(String[] args) {

        String s1="sumit kumar jha";
        int spacecount=0;

        for(int i=0;i<s1.length();i++)
        {
            char ch = s1.charAt(i);
            if(ch==32)
            {
                spacecount++;
            }
        }
        System.out.println(spacecount);//2

    }
}
