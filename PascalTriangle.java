import java.util.*;
public class PascalTriangle {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> cur, prev = null;
        for(int i=0;i<numRows;i++)
        {
            cur = new ArrayList<>();
            for(int j=0;j<=i;j++)
            {
                if(j==0 || j==i)
                    cur.add(1);
                else
                    cur.add(prev.get(j-1) + prev.get(j));
            }
            prev = cur;
            result.add(cur);
        }
        return result;
    }

    public static void main(String[] args) {
        List<List<Integer>> pascal = generate(5);
        for(List i : pascal)
            System.out.println(i);
    }
}
