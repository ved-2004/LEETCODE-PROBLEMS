import java.util.Stack;

/*
This Method is not proper - I have used the ASCII values of the parenthesis to check so that the code is a bit less lengthy.
Also, it involves the usage of Stack class in Java - An inbuilt stack class with all the required functions.
 */
public class ValidParenthesis {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            char c = s.charAt(i);
            if(c=='{' || c=='[' || c=='(')
                stack.push(c);
            else if (c=='}' || c==']' || c==')') {
                if(stack.empty())
                    return false;
                char top = stack.peek();
                int diff = (int)c - (int)top;
                if((top=='(' && diff==1) || diff==2)
                    stack.pop();
                else
                    return false;
            }
        }
        if(stack.empty())
            return true;
        else
            return false;
    }
}
