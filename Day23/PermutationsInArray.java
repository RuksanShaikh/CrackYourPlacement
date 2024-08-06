class PermutationsInArray {
    public boolean isPossible(int k, int[] arr1, int[] arr2) {
        
        int n=arr1.length;
        Arrays.sort(arr1);
        
        for(int i=0;i<n/2;i++){
            int temp=arr1[i];
            arr1[i]=arr1[n-i-1];
            arr1[n-i-1]=temp;
        }
        Arrays.sort(arr2);
        
        for(int i=0;i<n;i++){
            if(arr1[i]+arr2[i]<k){
                return false;
            }
            
        }
        
        return true;
        
    }
}