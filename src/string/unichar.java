package string;

public class unichar {
    public static void main(String[] args) {
        String s="ABCDABC";

        for(int i=0;i<s.length();i++)
        {
            boolean unique=true;
            for(int j=0;j<s.length();j++)
            {
                if(i!=j&& s.charAt(i)==s.charAt(j))
                {
                    unique=false;
                }
            }
            if(unique)
            {
                System.out.print(s.charAt(i));
                break;
            }
        }

    }
}
