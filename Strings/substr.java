package Strings;
import java.util.*;

public class substr {
    public static void main(String[] args) {
        String str = "abcde";
        // System.out.println(str.substring(0, 2));
        // System.out.println(str.substring(2));

        // String s = "physics";
        // for(int j=2;j<4;j++){
        //     System.out.print(s.substring(j));
        // }

        String s = "abcd";
        for(int i=0;i<=s.length()-1;i++){
            for(int j=i+1;j<=s.length();j++){
                System.out.print(s.substring(i, j)+" ");
            }
        }
    }
    
}
