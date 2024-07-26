class ProductExceptSelf 
{ 
	public static long[] productExceptSelf(int nums[], int n) 
	{ 
	    long[] ans=new long[n];
	    long[] pre=new long[n];
	    long[] pos=new long[n];
	    
	    pre[0]=1;
	    
        for(int i=1;i<n;i++){
            
            pre[i]=pre[i-1]*nums[i-1];
        }
        
        pos[n-1]=1;
        
        for(int i=n-2;i>=0;i--){
            pos[i]=pos[i+1]*nums[i+1];
        }
        
        for(int i=0;i<n;i++){
            ans[i]=pre[i]*pos[i];
        }
        
        return ans;
	} 
} 
