class FidPair {
    public int findPair(int n, int x, int[] arr) {
        // code here
        
        Set<Integer> set=new HashSet<>();
        
        for(int ele:arr){
            if(set.contains(ele+x) || set.contains(ele-x)){
                return 1;
            }
            set.add(ele);
        }
        return -1;
    }
}