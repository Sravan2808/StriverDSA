package Strings;
import java.util.*;

public class equals {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "hello";
        String s3 = new String("hello");
        System.out.println(s1==s2);
        System.out.println(s2==s3);
        System.out.println(s1.equals(s3));
    }
}
