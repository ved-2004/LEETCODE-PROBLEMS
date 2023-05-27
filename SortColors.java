public class SortColors {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int[] count = new int[3];
        int[] output = new int[n];
        for(int i=0;i<n;i++)
        {
            count[nums[i]]++;
        }
        for(int i=1;i<3;i++)
        {
            count[i] += count[i-1];
        }
        for(int i=n-1;i>=0;i--) {
            output[count[nums[i]] - 1] = nums[i];
            count[nums[i]]--;
        }
        for(int i=0;i<n;i++)
        {
            nums[i] = output[i];
        }
    }
}
