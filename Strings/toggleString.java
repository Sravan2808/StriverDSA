package Strings;
import java.util.*;
public class toggleString {
    public static void main(String[] args) {
        String str = "phYSiCS";
        for(int i=0;i<str.length();i++){
                   //P->p
            //check ->alphabet-small,captial

            boolean flag = true; //true-->capital
            char ch = str.charAt(i);//A
            if(ch==' ') continue;
            int asci = (int)ch;//65
            if(asci>=97) flag=false;//small
            if(flag==true){//capital
                asci+=32;
                char dh = (char)asci; //a
               str = str.substring(0, i) + dh + str.substring(i+1);
            }
            else{//small
                asci-=32;
                char dh = (char)asci;
                str = str.substring(0, i) + dh + str.substring(i+1);
            }
        }
        System.out.println(str);
    }
}
