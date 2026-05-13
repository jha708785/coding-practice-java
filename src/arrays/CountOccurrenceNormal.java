package arrays;

public class CountOccurrenceNormal {

    static void main() {

        int[] arr={1,2,2,2,3,4,5};
        int search=2;
        int count=0;

        for (int i=0;i<arr.length;i++){
            if (arr[i]==search){
                count++;
            }
        }
        System.out.println(count);
    }
}
