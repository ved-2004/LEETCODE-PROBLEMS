public class RunningSum1DArray {
    public int[] runningSum(int[] nums) {
        int[] arr = new int[nums.length];
        int sum=0;
        int p=0;
        for(int i : nums)
        {
            sum += i;
            arr[p++] = sum;
        }
        return arr;
    }
}
