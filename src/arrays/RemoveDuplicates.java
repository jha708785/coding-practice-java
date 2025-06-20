package arrays;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RemoveDuplicates {

    public static void main(String[] args) {

        int[] a= {1,1,2,3,1,2,2,3,3,5,4,4,5};
        Arrays.sort(a);



        int[] temp=new int[a.length];
        int j=0;
        for(int i=0;i<a.length-1;i++)
        {
            if(a[i]!=a[i+1])
            {
                temp[j]=a[i];
                j++;
            }
        }
        temp[j]=a[a.length-1];
        for(int i=0;i<temp.length;i++) {
            System.out.print(temp[i]+"");
        }

       /* int[] numbers = {1, 2, 2, 3, 4, 4, 5};

        int[] uniqueNumbers = Arrays.stream(numbers)
                .distinct()
                .toArray();

        System.out.println(Arrays.toString(uniqueNumbers));*/



    }
}
