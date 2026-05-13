package string;

import java.util.HashMap;
import java.util.Map;

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
        System.out.println(map);

        // Step 2: find max
        char maxChar = ' ';
        int max = 0;

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
                maxChar = entry.getKey();
            }
        }

        System.out.println("Max char: " + maxChar);
        System.out.println("Frequency: " + max);

    }
}
