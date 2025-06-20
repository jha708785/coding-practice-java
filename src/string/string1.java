package string;


public class string1 {


    public static String dollerData(String str)
    {
        int count=0;
        StringBuilder stringBuilder=new StringBuilder();

        for (int i=0;i<str.length();i++){
            Character ch=str.charAt(i);
            //System.out.print(ch);

            if (ch=='o'|| ch=='O'){
                count++;

                if (count>0){
                    for (int j=1;j<=count;j++){
                        Character doller='$';
                        stringBuilder.append(doller);
                    }
                }
            }
            else {
                stringBuilder.append(ch);
            }
        }
        return stringBuilder.toString();
    }
    public static void main(String[] args) {

        /*

        input :Go to joho  here o is replace with $ with increasing number
        output : G$ t$$ j$$$ h$$$$
         */

        String str="Go to Joho";
        String s = dollerData(str);
        System.out.println(s);




    }
}
