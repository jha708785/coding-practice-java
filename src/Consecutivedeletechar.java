public class Consecutivedeletechar {

    // Input => aaa bb cc b a
    // Output => abc

    public static String removeconsutive(String str){

        int n=str.length();
        String ans=" ";

        for (int i=0;i<n;i++){
            if(i<n-2&& str.charAt(i)==str.charAt(i+1)){
                continue;
            }
            else {
                ans=ans+str.charAt(i);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        String str="aaa bb cc a";
        System.out.println(removeconsutive(str));
    }
}
