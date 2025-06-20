package string;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class removeduplicate {

    public static void main(String[] args) {

        String str= "i am sumit sumit kumar sumit";
        String[] inputarr=str.split(" ");

        Set<String> set = new HashSet<String>(Arrays.asList(inputarr));

        for (String s : set) {
            System.out.print(s + " ");
        }

    }
}
