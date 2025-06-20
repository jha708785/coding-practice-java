package string;

import java.util.Random;

public class randomstring {
    public static void main(String[] args) {

        String rendomstring="abcdefghijklmnopqrstuvwxyz";
        String randomstring=" ";

        StringBuilder sb=new StringBuilder();
        Random ran=new Random();

        int length=6;
        for (int i=0;i<length;i++){
            int index=ran.nextInt(rendomstring.length());

            char c=rendomstring.charAt(index);
            sb.append(c);

        }
        randomstring =sb.toString() +" ";
        System.out.println(randomstring);
    }
}
