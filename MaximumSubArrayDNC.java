import java.util.*;
public class MaximumSubArrayDNC {
    public int combine(int[] nums) {
        int mid = nums.length / 2;
        int maxL = nums[mid];
        int temp = maxL;
        for(int i=mid-1;i>=0;i--)
        {
            temp += nums[i];
            maxL = Math.max(temp, maxL);
        }
        int maxR = nums[mid];
        temp = maxR;
        for(int i=mid+1;i<nums.length;i++)
        {
            temp += nums[i];
            maxR = Math.max(temp, maxR);
        }
        return Math.max(maxR + maxL - nums[mid] , Math.max(maxR, maxL));
    }
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        if (n==1)
            return nums[0];
        int[] left = Arrays.copyOfRange(nums, 0, n/2);
        int[] right = Arrays.copyOfRange(nums, n/2, n);
        int maxL = maxSubArray(left);
        int maxR = maxSubArray(right);
        int maxC = combine(nums);
        return Math.max(maxC, Math.max(maxR, maxL));
    }
}
