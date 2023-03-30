import java.util.*;

public class RepeatedDNASequences {
    public List<String> findRepeatedDnaSequences(String s) {
        HashMap<String,Integer> map = new HashMap<>();
        Set<String> set = new HashSet<>();
        for(int i=0;i<=s.length()-10;i++)
        {
            String sub = s.substring(i,i+10);
            if (map.containsKey(sub))
                set.add(sub);
            else
                map.put(sub,1);
        }
        List<String> list = new ArrayList<>();
        list = List.copyOf(set);
        return list;
    }
}
