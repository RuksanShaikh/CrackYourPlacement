class FindAllDuplicates {
    public List<Integer> findDuplicates(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        List<Integer> newlist=new ArrayList<>();
       
        for(int i=0;i<n-1;i++){
         
            if(nums[i]==nums[i+1]){
                newlist.add(nums[i]);    
            }
        }

        return newlist;
    }
}