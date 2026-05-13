package Collection;

public class balance {


    static void main() {

        String str = "}{{}}{{{";
        int count=0;
        for (int i=0;i<str.length();i++){

            if (str.charAt(i)=='['){
                count++;
            } else if (str.charAt(i)==']') {
                count--;
            } else if (str.charAt(i)=='{') {
                count++;
            } else if (str.charAt(i)=='}') {
                count--;
            }
        }

        if (count==0){
            System.out.println("balanced..");
        }
        else {
            System.out.println("not balanced..");
        }

    }
}
