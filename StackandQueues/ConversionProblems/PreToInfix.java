package StackandQueues.ConversionProblems;

import java.util.Stack;

public class PreToInfix {
    public static void main(String[] args) {
        Stack<String> val = new Stack<>();
        String st = "-9/*+5346";
        for(int i=st.length()-1;i>=0;i--){
            char ch = st.charAt(i);
            int ascii = (int)ch;
            if(ascii>=48 && ascii<=57){
                val.push(ch+"");
            }
            else{
                String v1 = val.pop();
                String v2 = val.pop();
                char o = ch;
                String t = "("+v1+o+v2+")";
                val.push(t);
            }
        }
        System.out.println(val.peek());
    }
}
