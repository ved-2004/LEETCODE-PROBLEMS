// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
public class FindNoswithEvenDigits {
    public boolean checkDigits(int n)
    {
        boolean c = true;
        while(n>0)
        {
            n=n/10;
            c = !c;
        }
        return c;
    }
    public int findNumbers(int[] nums) {
        int ans = 0;
        for(int i=0;i<nums.length;i++)
        {
            if(checkDigits(nums[i]))
                ans++;
        }
        return ans;

    }
}
