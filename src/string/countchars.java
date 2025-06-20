package string;

public class countchars {
    public static void main(String[] args) {
        String name="sumit kumar jha ";
        String replace=name.replace("","");
        int count=0;
        for (int i=0;i<name.length();i++){
            if(name.charAt(i)!=' '){
                count++;
            }
        }
        System.out.println(count);
    }
}
