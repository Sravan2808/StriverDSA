package Strings;
import java.util.*;
public class StringCompression {
    public static void main(String[] args) {
        String str = "aaabbbccdde";
        String ans = ""+str.charAt(0);//a3b
        int cnt = 1;
        for(int i=1;i<str.length();i++){
            char curr = str.charAt(i);
            char prev = str.charAt(i-1);
            if(curr == prev){
                cnt++;
            }
            else{
                ans+=cnt;
                cnt=1;
                ans+=curr;
            }
        }
        ans+=cnt;
        System.out.println(ans);
    }
}
