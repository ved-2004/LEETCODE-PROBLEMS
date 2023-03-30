import java.util.Stack;

public class IsSubsequence {
    public boolean isSubsequence(String s, String t) {
        Stack<Character> stack = new Stack<>();
        for(int i=s.length()-1;i>=0;i--)
        {
            stack.push(s.charAt(i));
        }
        for(int i=0;i<t.length();i++)
        {
            if(stack.empty())
                return true;
            if(t.charAt(i) == stack.peek())
            {
                stack.pop();
            }
        }
        if(stack.empty())
            return true;
        return false;
    }
}
