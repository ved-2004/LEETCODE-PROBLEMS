public class FindPivotIndex {
    public int pivotIndex(int[] nums) {
        int lsum=0,rsum = 0;
        for(int i:nums)
        {
            rsum+=i;
        }
        rsum -= nums[0];
        for(int i=0;i<nums.length;i++)
        {
            if(lsum == rsum)
                return i;
            if(i==nums.length-1)
                return -1;
            rsum-=nums[i+1];
            lsum+=nums[i];
        }
        return -1;
    }
}
