package Strings;
import java.util.*;
public class stringBuilder {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("hello");
        System.out.println(str);
        //hello --> mello
        str.setCharAt(0, 'm');
        System.out.println(str);
        str.append(true);
        System.out.println(str);
        str.insert(2,"y");
        System.out.println(str);
        str.deleteCharAt(2);
        System.out.println(str);
        str.reverse();
       System.out.println(str);
       str.reverse();
       System.out.println(str);
       str.delete(0, 5);
       System.out.println(str);
       
    }
}
