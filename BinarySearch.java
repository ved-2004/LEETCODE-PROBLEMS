public class BinarySearch {
    public int BinarySearch(int[] nums, int low, int high, int target)
    {
        if(low>high)
            return -1;
        int mid = (low+high)/2;
        if(nums[mid]==target)
            return mid;
        else if (nums[mid] > target)
        {
            return BinarySearch(nums,0,mid-1,target);
        }
        else
            return BinarySearch(nums,mid+1,high,target);
    }
    public int search(int[] nums, int target) {
        return BinarySearch(nums, 0, nums.length-1,target);
    }
}
