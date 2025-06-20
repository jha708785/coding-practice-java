package string;

public class PrintWordFirstChar {

    public static void main(String[] args) {
        String str="this is sumit kumar jha";
        spliteachword(str);

    }
    public static void spliteachword(String str) {

        String[] word = str.split(" ");

        for (int i = 0; i < word.length; i++) {

            String s = word[i];
            System.out.print(s.charAt(0));
        }
    }

    }
