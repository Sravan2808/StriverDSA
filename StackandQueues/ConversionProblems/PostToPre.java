import java.util.Stack;

public class PostToPre {
    public static void main(String[] args) {
        Stack<String> val = new Stack<>();
        String st = "953+4*6/-";
        for(int i=0;i<st.length();i++){
            char ch = st.charAt(i);
            int ascii = (int)ch;

            if(ascii>=48 && ascii<=57){
                val.push(ch+"");
            }
            else{
                String v2 = val.pop();
                String v1 = val.pop();
                char o = ch;
                String t = o+v1+v2;
                val.push(t);
            }
        }
        System.out.println(val.peek());
    }
}
