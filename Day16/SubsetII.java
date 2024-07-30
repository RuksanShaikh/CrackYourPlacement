class SubsetII {

    
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Set<List<Integer>> subset=new HashSet<>();
        Arrays.sort(nums);
        findSubset(nums,0,new ArrayList(),subset);
        return new ArrayList<>(subset);

    }

    public void findSubset(int[] nums,int index,List<Integer> sublist,Set<List<Integer>>subset){

        if(index>nums.length){
            return;
        }

        subset.add(sublist);
        
        for(int i=index;i<nums.length;i++){
            List<Integer>newList=new ArrayList<>(sublist);
            newList.add(nums[i]);

            findSubset(nums,i+1,newList,subset);
        }
       
    }
}