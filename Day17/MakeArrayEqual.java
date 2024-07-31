import java.util.*;
class MakeArrayEqual {
    
    public static int makeArrayEqual(int[] arr,int n){
        
        
        int mid;
        if(n%2==1){
            mid=arr[n/2];
        }
        
        else
        {
            mid=(arr[n/2]+arr[(n-2)/2])/2;
        }
        
        int sum=0;
        
        for(int i=0;i<n;i++){
            sum+=Math.abs(arr[i]-mid);
        }
        
        return sum;
    }
    public static void main(String[] args) {
       int[] arr={1, 100, 101};
       Arrays.sort(arr);
       int n=arr.length;
       System.out.println(makeArrayEqual(arr,n));
    }
}