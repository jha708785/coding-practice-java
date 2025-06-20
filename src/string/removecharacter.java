package string;

public class removecharacter {
    public static void main(String[] args) {
        String s="sumitkumaaar";
        char d='a';
        System.out.println( removecharacters(s,d));
    }

    private static String removecharacters(String s, char d) {
        String ans="";
        for (int i=0;i<s.length();i++){
            if (s.charAt(i)!=d){
                ans+=s.charAt(i);
            }
        }
        return ans;
    }
}
