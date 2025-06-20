package string;
import  java.util.*;
public class counteachword {
    public static void main(String[] args) {

        String str="sumit kumar jha mangrahta madhubani";

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
        System.out.print(map);


    }
}
