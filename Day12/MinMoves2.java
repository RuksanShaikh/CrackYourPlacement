class MinMoves2 {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int ans=0;
        int n=nums[nums.length>>1];

        for(int ele:nums){
            ans+=Math.abs(ele-n);
        }
        return ans;
       
    }
}