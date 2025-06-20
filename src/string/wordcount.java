package string;

public class wordcount {
    public static void main(String[] args) {

        String name="this is java";
        String search="is";

        int count=0;
        for (int i=0;i<name.length()-1;i++){
            if (name.substring(i,i+2).equals(search)){
                count++;
            }
        }
        System.out.println(count);
    }
}
