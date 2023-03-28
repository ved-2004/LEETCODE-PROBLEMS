import java.util.HashMap;

/*
PROBLEM:
find index of two numbers from given array whose sum is target
EXPLANATION :
1) Brute Force: nested for loop to check each pair  =  O(n2);
2) HashMap method: Iterate the list, store the number which is to be found, i.e. (target - current num)
   therefore, if for current index, if the number is present in the hashmap, then you have the answer.
   if not, then add the pair of the (target - number) and index to the map.  = O(n).
*/
public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i< nums.length;i++)
        {
            if(map.containsKey(nums[i])) {
                ans[0] = map.get(nums[i]);
                ans[1] = i;
                return ans;
            }
            map.put(target - nums[i],i);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] ans = twoSum(new int[]{2,3,4,5}, 8);
        System.out.println(ans[0] + " " + ans[1]);
    }
}
