import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class java8 {

    public static void main(String[] args) throws IOException {

        FileOutputStream out=new FileOutputStream("C:\\Users\\Suman Kumar\\OneDrive\\Desktop\\Java\\text.txt.txt");

        String str="sumit kumar jha";

        char ch[] =str.toCharArray();

        for (int i=0;i<str.length();i++){
            out.write(ch[i]);
            out.close();
        }
    }
}
