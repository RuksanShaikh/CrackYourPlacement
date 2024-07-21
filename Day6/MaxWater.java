class MaxWater {
    public int maxArea(int[] height) {
        int n=height.length;

        int maxWater=0;
        int left=0;
        int right=n-1;

        while(left<right){
            maxWater=Math.max(maxWater,Math.min(height[left],height[right])*(right-left));
            if(height[left]<height[right])
            {
                left++;
            }
            else{
                right--;
            }
        }
        return maxWater;
       
    }
}