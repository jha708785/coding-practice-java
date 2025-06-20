package string;

public class removewhitespace {
    public static void main(String[] args) {
        String name="sumit kumar jha ";
        String sp=" ";

        for (int i=0;i<name.length();i++){
            if (name.charAt(i)!=' '){
                sp=sp+name.charAt(i);
            }
        }
        System.out.print(sp);
    }
}
