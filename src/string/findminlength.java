package string;

public class findminlength {
    public static void main(String[] args) {
        String str="this is sumit kumar jha ";
        String out=minlength(str);
        System.out.println(out);

        //output is
    }

    private static String minlength(String str) {

        String[] ch= str.split(" ");
       String min=str;

       for (int i=0;i<ch.length;i++){
           if (ch[i].length()<min.length()){
               min=ch[i];
           }
       }
       return min;

    }
}
