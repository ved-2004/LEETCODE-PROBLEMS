public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int maxHeight = height[0], area = 0, index = 0;
        int i = 0, j = height.length-1;
        while(i<j)
        {
            area = Math.max(area, Math.min(height[i],height[j])*(j-i));
            if(height[i]==height[j])
            {
                i++;
                j--;
            }
            else if(height[i] > height[j])
                j--;
            else
                i++;
        }
        return area;
    }
}
