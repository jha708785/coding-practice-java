package arrays;

public class deletearray {
    public static void main(String[] args) {

        int[] str={1,2,3,4,5,6,7};
        int delete=7;
        for (int i=0;i<str.length;i++){
            if (str[i]==delete){
                for (int j=i;j<str.length-1;j++){
                    str[j]=str[j+1];
                }
                break;
            }
        }

        for (int i=0;i<str.length-1;i++){
            System.out.print(str[i]);
        }
    }
}
