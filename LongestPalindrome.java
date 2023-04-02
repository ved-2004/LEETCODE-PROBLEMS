import java.util.*;
public class LongestPalindrome {
    public int longestPalindrome(String s) {
        Set<Character> list = new HashSet<>();
        int len = 0;
        for(int i=0;i<s.length();i++)
        {
            char c = s.charAt(i);
            if(list.contains(c))
            {
                len += 2;
                list.remove(c);
            }
            else
            {
                list.add(c);
            }
        }
        return list.isEmpty() ? len : len + 1;
    }

}
