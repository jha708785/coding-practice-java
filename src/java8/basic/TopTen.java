package java8.basic;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TopTen {
    static void main() {

      List<Integer>list= Arrays.asList(1,1,1,2,3,4,5,6,7,8,9,0);
//
//        // 1. Even Number
//        list.stream().filter(f -> f % 2 == 0).forEach(System.out::println);
//
//        //2. Remove duplicate
//
//        list.stream().distinct().forEach(System.out::println);
//
//        Set<Integer> set=new HashSet<>();
//        list.stream().filter(m->set.add(m)).forEach(System.out::println);
//
//        list.stream().max(Integer::compare).get();
//
//        list.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
//
//        list.stream().sorted(Comparator.reverseOrder());


        Map<Integer, Long> collect = list.stream()
                .collect(Collectors
                        .groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(collect);

    }
}
