class MajorityElement {
    public int majorityElement(int[] nums) {
        int vote=1;
        int n=nums[0];
        for(int i=1;i<nums.length;i++){
            if(vote==0)
            {
                vote++;  
                n=nums[i];
            }
            else if(n==nums[i]){
                vote++;
               
            }
            else{
                vote--;
            }
        }
        
       return n; 
    }
}