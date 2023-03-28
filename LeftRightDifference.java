public class LeftRightDifference {
    public int[] leftRigthDifference(int[] nums) {
        int[] ans = new int[nums.length];
        int sumr = 0;
        for(int i=1;i<nums.length;i++)
        {
            sumr += nums[i];
        }
        int suml = 0;
        int i;
        for(i=0;i<nums.length-1;i++)
        {
            ans[i] = Math.abs(suml - sumr);
            sumr -= nums[i+1];
            suml += nums[i];
        }
        ans[i] = Math.abs(suml - sumr);
        return ans;
    }
}
