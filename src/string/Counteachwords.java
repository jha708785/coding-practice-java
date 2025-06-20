package string;

import java.util.HashMap;
import java.util.Map;

public class Counteachwords {

    public static void main(String[] args) {

        String s="thisissumitkumarjha";

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
        System.out.print(map);



    }
}
