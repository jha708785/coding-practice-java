package java8.Streanapi;

import java.util.List;
import java.util.stream.Collectors;

public class method {

    public static void main(String[] args) {

        // filter (predicate)
        //boolean value function
        //check predicate and filter vallued

        // map

        // each element operatin return value;

        List<String>name=List.of("sumit","kumar","jha","apple","ape","ant");

        List<String> newname= name.stream().filter(e->e.startsWith("a")).collect(Collectors.toList());

        System.out.println(newname);


        List<Integer> number=List.of(2,3,4,5,6,7,8,9);
       List<Integer> newnumber= number.stream().map(i-> i*i).collect(Collectors.toList());
        System.out.println(newnumber);

        Integer i=number.stream().max(Integer::compareTo).get();
        System.out.println(i);
    }
}
