public class ShuffleTheArray {
    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[2*n];
        int p=0;
        for(int i=0;i<n;i++) {
            ans[p++] = nums[i];
            ans[p++] = nums[n+i];
        }
        return ans;
    }
}
