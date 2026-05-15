package string;

public class countchars {
    public static void main(String[] args) {
        String name="sumit kumar jha ";

        String replace=name.replace("","");
        int c=0;
        char[]ch=name.toCharArray();
        for (int i=0;i<ch.length;i++){
            if (ch[i]!=' '){
                c++;
            }
        }
        System.out.println(c);
        int count=0;
        for (int i=0;i<name.length();i++){
            if(name.charAt(i)!=' '){
                count++;
            }
        }
        System.out.println(count);
    }
}
