import java.util.*;

class PeakElement{
    
    public static int makeValueEqualToMin(int[] a,int n){
        
        int val;
        if(n%2==1){
            val= a[n/2];
        }
        else{
            val=(a[n/2]+a[(n-2)/2])/2;
        }
        
        int result=0;
        
        for(int i=0;i<n;i++){
            result+=Math.abs(a[i]-val);
        }
        
        return result;
        
    }
    public static void main(String args[]){
        int[] a={4,6};
        Arrays.sort(a);
        int n=a.length;
       System.out.println(makeValueEqualToMin(a,n));
        
    }
}