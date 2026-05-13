package java8.basic;

import java.util.*;
import java.util.stream.Collectors;

public class even {
    static void main() {

        List<Integer> list=List.of(1,2,3,4,4,5);

        list.stream()
                .filter(n->n%2==0)
                .forEach(System.out::println);

        list.stream()
                .filter(n->n%2!=0)
                .forEach(System.out::println);

        list.stream()
                .map(String::valueOf)
                .filter(n->n.startsWith("1"))
                .forEach(System.out::println);

        Set<Integer>set=new HashSet<>();

        list.stream()
                .filter(n->!set.add(n))
                .forEach(System.out::println);

        list.stream()
                .findFirst()
                .ifPresent(System.out::println);

        list.stream()
                .count();

        list.stream()
                .max(Integer::compareTo)
                .ifPresent(System.out::println);

        list.stream()
                .sorted(Collections.reverseOrder());

        list.stream().mapToInt(Integer::intValue).sum();

        list.stream().collect(Collectors.toSet());

        //list.stream().collect(Collectors.toMap(n->n,String::length));

        list.stream().distinct().sorted(Collections.reverseOrder()).skip(1).findFirst();

        list.stream().sorted().forEach(System.out::println);

        list.stream().allMatch(n->n%2==0);

        //duplicate number
                list.stream()
                        .collect(Collectors.groupingBy(n->n,Collectors.counting()))
                        .entrySet()
                        .stream()
                        .filter(e->e.getValue()>1).forEach(System.out::println);


                list.stream().collect(Collectors.groupingBy(n->n,Collectors.counting()))
                        .entrySet().stream().filter(e->e.getValue()>1);
    }
}
