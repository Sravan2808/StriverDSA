import java.util.Stack;

public class PostToInfix {
    public static void main(String[] args) {
        String st = "953+4*6/-";
        Stack<String> val = new Stack<>();
        for(int i=0;i<st.length();i++){
            char ch = st.charAt(i);
            int ascii = (int)ch;
            if(ascii>=48 && ascii<=57) val.push(ch+"");
            else{
                String v2 = val.pop();
                String v1 = val.pop();
                char o = ch;
                String t = "("+v1+o+v2+")";
                val.push(t);
            }
        }
        System.out.println(val.peek());
    }
}
