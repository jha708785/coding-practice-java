package java8.basic;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class strings {
    static void main() {
        String str="java";
        String str1="tava";

        Arrays.equals(str.chars().sorted().toArray(),
                str1.chars().sorted().toArray());

        List<String> stringList=Arrays.asList("java","python","boot");
        String RESULT=stringList.stream().collect(Collectors.joining(","));
        System.out.println(RESULT);


    }
}
