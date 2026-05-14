package string;

import java.util.HashMap;
import java.util.Map;

public class MapMenipulate {

    static void main() {

        Map<Integer,String> map=new HashMap<>();
        map.put(1,"sagar");
        map.put(2,"sangam");

        for (Map.Entry<Integer,String> entry: map.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        map.forEach((k,v)->{
            System.out.println(k +" -> " + v);
        });


    }
}
