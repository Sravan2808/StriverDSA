import java.util.*;
public class infixToPostfix {
    public static void main(String[] args) {

        String infix = "9-(5+3)*4/6";
        System.out.println("infix Expression : " + infix);
        Stack<String> val = new Stack<>();
        Stack<Character> op = new Stack<>();
        for(int i=0;i<infix.length();i++){
            char ch = infix.charAt(i); //5
            int ascii = (int)ch; //53
            //'0' -> 48 and '9' ->57
            if(ascii>=48 && ascii<=57){ //0 to 9
                String s = ""+ch;
                val.push(s);
            }
            else if(op.size()==0 || ch=='(' || op.peek()=='(') op.push(ch);
            else if(ch==')'){
                while(op.peek()!='('){
                    String v2 = val.pop();
                    String v1 = val.pop();

                    char o = op.pop();
                    String t =  v1 + v2 + o;
                    val.push(t);
                }
                op.pop(); //'(' hata diya

            }
            else{
                if(ch=='+' || ch == '-'){
//                    Work
                    String v2 = val.pop();
                    String v1 = val.pop();

                    char o = op.pop();
                    String t = v1 + v2 + o;
                    val.push(t);
                    //push
                    op.push(ch);
                }
                if(ch=='*' || ch=='/'){
                    if(op.peek()=='*' || op.peek()=='/'){
                        //work
                        String v2 = val.pop();
                        String v1 = val.pop();

                        char o = op.pop();
                        String t = v1 + v2 + o;
                        val.push(t);

                        //push
                        op.push(ch);
                    }
                    else op.push(ch);
                }
            }
        }
//        val stack size -> 1
        while(val.size()>1){
            String v2 = val.pop();
            String v1 = val.pop();

            char o = op.pop();
            String t = v1 + v2 + o;
            val.push(t);
        }
        System.out.println("Postfix Expression : "+ val.peek());
    }
}
