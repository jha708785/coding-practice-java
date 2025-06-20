package string;

import java.util.*;

public class duplicatefind2way {
    public static void main(String[] args) {
        String[] str= {"sumit","sumit","sagar","sagar" ,"asa","suman","suman"};


        for(int i=0;i<str.length;i++) {
            for(int j=i+1;j<str.length;j++) {
                if(str[i]==str[j]) {
                    System.out.println(str[j]+" ");
                    break;
                }
            }
        }

    }
}
