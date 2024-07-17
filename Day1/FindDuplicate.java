class FindDUplicate {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int result=0;
        for(int i=0;i<n-1;i++){
            if(nums[i]==nums[i+1]){
                result=nums[i];
                break;
            }
        }
        return result;
       
    }
}