package string;
import  java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class counteachword {
    public static void main(String[] args) {

        String str="sumit kumar kumar  jha mangrahta madhubani jha";

        String[] split = str.split(" ");
        int count=0;
        Map<String, Integer>map=new HashMap<>();

        for(int i=0;i<split.length;i++)
        {
            count=0;
            for(int j=0;j<split.length;j++) {
                if(split[i].equals(split[j]))
                {
                    count++;
                }
                map.put(split[i], count);
            }

        }
       // System.out.println(map);


        String[] words = str.split("\\s+");
        Map<String, Integer> maps = new HashMap<>();

        for(String word : words) {

            maps.put(word, map.getOrDefault(word, 0) + 1);
        }
        //System.out.println(map);

        Map<String, Long> wordCount =
                Arrays.stream(str.split(" "))
                        .collect(Collectors.groupingBy(
                                Function.identity(),
                                Collectors.counting()
                        ));

        System.out.println(wordCount);
    }
}


