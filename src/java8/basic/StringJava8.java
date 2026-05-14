package java8.basic;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StringJava8 {
    static void main() {

        String str = "suman kumar jha";

        Map<Character, Long> count =
                str.chars()
                        .filter(ch -> ch != ' ') // optional: ignore spaces
                        .mapToObj(ch -> (char) ch)
                        .collect(Collectors.groupingBy(
                                Function.identity(),
                                Collectors.counting()
                        ));

        System.out.println(count);



    }
}
