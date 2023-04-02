import java.util.*;

public class MostFreqEvenElement {
    public int mostFrequentEven(int[] nums) {
        int max = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i : nums)
        {
            if(i%2==0)
            {
                if(map.containsKey(i))
                {
                    map.put(i,map.get(i)+1);
                }
                else
                {
                    map.put(i,1);
                }
                max = Math.max(max, map.get(i));
            }
        }
        int n = Integer.MAX_VALUE;
        for(Map.Entry<Integer,Integer> hmp : map.entrySet())
        {
            if(hmp.getValue()==max)
            {
                n = Math.min(hmp.getKey(),n);
            }
        }
        return n==Integer.MAX_VALUE?-1:n;
    }
}
