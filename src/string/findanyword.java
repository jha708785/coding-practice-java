package string;

public class findanyword {

    public static void main(String[] args) {

        String str="this is sumit kumar jha this this ";
       String[] s= str.split(" ");
        String search="this";
        int count=0;

        for(String i:s){
            if (i.equalsIgnoreCase(search)){
                count++;

            }
        }
        System.out.println(search);
        System.out.println(count);
    }
}
