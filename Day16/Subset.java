class Subset {
    List<List<Integer>>subset=new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
              findSublist(nums,0,new ArrayList<>());
              return subset;
    }


    public void findSublist(int[] nums,int index,List<Integer>sublist){
        if(index==nums.length){
          subset.add(new ArrayList<>(sublist));
          return;
          
        }

        sublist.add(nums[index]);
        findSublist(nums,index+1,sublist);

        sublist.remove(sublist.size()-1);
        findSublist(nums,index+1,sublist);


    }
}