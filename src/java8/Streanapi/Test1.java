package java8.Streanapi;

import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test1 {
    public static void main(String[] args) {


        // filter all even number

      List<Integer>list=  List.of(1,2,1,3,4,5,6,7,8,9);
       List<Integer>l= (List<Integer>) list.stream().filter(e->e%2==0).collect(Collectors.toList());
        System.out.println(l);

       HashSet<Integer> l2=  new HashSet<>(list);
        System.out.println(l2);

        String[] name={"sumit","kumar","jha"};

        Stream<String> s=Stream.of(name);
        s.forEach(System.out::println);

    }
}
