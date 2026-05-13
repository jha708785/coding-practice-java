package string;
import  java.util.*;
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
        System.out.println(map);

        String maxWord = "";
        int max = 0;

        for (String key : map.keySet()) {
            if (map.get(key) > max) {
                max = map.get(key);
                maxWord = key;
            }
        }

        System.out.println(maxWord);
    }
}

/*

String str = "sumit kumar jha mangrahta madhubani";

Map<String, Integer> map = new HashMap<>();

for (String word : str.split(" ")) {
    map.put(word, map.getOrDefault(word, 0) + 1);
}

System.out.println(map);
 */
