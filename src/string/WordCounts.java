package string;
import  java.util.Scanner;
public class WordCounts {
    public static void main(String[] args) {

        Scanner s1 = new Scanner(System.in);
        System.out.println("enter sentence");
        String sentence = s1.nextLine();
        //input ="this is java" output=3

        int count = 1;

        for (int i = 1; i < sentence.length()-1; i++)
        {
            if ((sentence.charAt(i) == ' ') && (sentence.charAt(i + 1) != ' ')) {
                count++;

            }
        }
        System.out.print(count);

    }
}
