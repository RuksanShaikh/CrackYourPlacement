class ThreeSum {

    List<List<Integer>> arr = new ArrayList<>();
    public List<List<Integer>> threeSum(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        

        for(int i=0;i<n;i++){
            if(i==0 || nums[i-1]!=nums[i]){
                twoSumSorted(i+1,n-1,nums,0-nums[i]);
            }
        }

        return arr;
    }

    void twoSumSorted(int i,int j,int[] nums,int val){
        int a1=nums[i-1];
        while(i<j){
            if(nums[i]+nums[j]>val){
                j--;
            }else if(nums[i]+nums[j]<val){
                i++;
            }else{
                List<Integer> list=new ArrayList<>();
                list.add(a1);
                list.add(nums[i]);
                list.add(nums[j]);

                arr.add(list);
                while(i<j&& nums[i]==nums[i+1])
                  i++;

                while(i<j&& nums[j]==nums[j-1])
                  j--;  

                i++;
                j--;
            }
        }

    }

}