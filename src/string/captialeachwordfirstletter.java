package string;

import java.util.Scanner;

public class captialeachwordfirstletter {

    public static void main(String[] args) {

        String str = "this is sumit kumar jha";
        String uppercase = "";
        Scanner s1 = new Scanner(str);

        while (s1.hasNext()) {
            String word = s1.next();

            // Capitalize the first letter of the current word
            String capitalizedWord = Character.toUpperCase(word.charAt(0)) + word.substring(1);

            uppercase += capitalizedWord + " ";
        }

        // Trim the extra whitespace at the end and print the result
        System.out.println(uppercase.trim());

        // Close the scanner
        s1.close();
    }
}
