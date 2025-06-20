package string;

public class countchar {

    public static void main(String[] args) {

        String t="sumit kumar jha";
       int length= t.length();

       int totallength=t.replace("a","").length();
       int count=length-totallength;
        System.out.println(count);
    }
}
