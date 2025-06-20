package string;

public class reverseeachword {
    public static void main(String[] args) {

        String name="sumit kumar jha";
      String[] sp=  name.split(" ");
      String rev=" ";
      for (String s:sp){
          String revword="";
          for (int i=s.length()-1;i>=0;i--){
              revword=revword+s.charAt(i);
          }
          rev=rev+revword+" ";
      }
        System.out.println(rev);


    }
}
