package dsa;

public class ExtractAllDigit {

    public static void extractDigits(int num) {
        String s = String.valueOf(num);

        for (char c : s.toCharArray()) {
            System.out.print(c + " ");
        }
    }

    public static void main(String[] args) {
        extractDigits(12345);
    }
}
