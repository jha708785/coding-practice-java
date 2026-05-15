package string;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Counteachwords {

    public static void main(String[] args) {

        String s="thisissumitkumarjhai";

        s=s.replace("", "");

        char arr[] =s.toCharArray();
        int count=0;

        Map<Character, Integer> map=new HashMap<>();

        for(int i=0;i<arr.length;i++)
        {
            count=0;
            for(int j=0;j<arr.length;j++)
            {
                if(arr[i]==arr[j]) {
                    count++;
                }

            }
            map.put(arr[i], count);
        }
        //System.out.println(map);

        Map<Character, Integer> maps = new HashMap<>();

        for(char ch : s.toCharArray()) {

            maps.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        System.out.println(map);

        Map<Character, Long> counts =
                s.chars()
                        .filter(ch -> ch != ' ') // optional: ignore spaces
                        .mapToObj(ch -> (char) ch)
                        .collect(Collectors.groupingBy(
                                Function.identity(),
                                Collectors.counting()
                        ));

       // System.out.println(counts);
    }
}
