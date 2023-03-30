import java.util.HashMap;

public class LongestSubstringWoRepeatChars {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        int max = 0;
        int temp = 0;
        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            if(map.containsKey(ch))
            {
                int last = map.get(ch);
                max = Math.max(max,temp);
                temp = i - last - 1;
                map.clear();
                for(int j=last+1;j<i;j++)
                {
                    map.put(s.charAt(j),j);
                }
            }
            map.put(ch,i);
            temp++;
        }
        return Math.max(max,temp);
    }
}
