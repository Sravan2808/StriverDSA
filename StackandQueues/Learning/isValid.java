package StackandQueues.Learning;

import java.util.Stack;

public class isValid {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[')
                st.push(ch);
            else {
                if (st.empty())
                    return false;
                if ((st.peek() == '(' && ch == ')') ||
                        (st.peek() == '{' && ch == '}') ||
                        (st.peek() == '[' && ch == ']')) {
                    st.pop();
                } else
                    return false;
            }
        }
        return st.empty();

    }
    
}
