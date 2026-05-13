package Collection;

import java.util.HashSet;

public class FindDuplicates {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4, 5, 1};
       HashSet<Integer> set=new HashSet<>();
       HashSet<Integer>duplicates=new HashSet<>();

       for (int a:arr){
           if (set.add(a));
           duplicates.add(a);
       }
        System.out.println("Duplicates: " + duplicates);
    }
}

