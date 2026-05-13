package string;

import java.util.*;

public class removeduplicate {

    public static void main(String[] args) {

        String str= "i am sumit sumit kumar sumit";
        String[] inputarr=str.split(" ");

        Set<String> set = new LinkedHashSet<>(Arrays.asList(inputarr));

        for (String s : set) {
            System.out.print(s + " ");
        }

    }
}
