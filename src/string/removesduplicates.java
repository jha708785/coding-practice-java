package string;

public class removesduplicates {

    public static void main(String[] args) {

        String s="thiss";

        char[] ch = s.toCharArray();
        StringBuilder b=new StringBuilder();

        for(int i=0;i<ch.length;i++)
        {
            boolean repeated=false;
            for(int j=i+1;j<ch.length;j++)
            {
                if(ch[i]==ch[j]) {
                    repeated = true;
                    break;
                }
            }

            if(!repeated)
            {
                b.append(ch[i]);
            }
        }
        System.out.println(b);



    }
}
