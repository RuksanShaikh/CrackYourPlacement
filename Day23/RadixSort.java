public class RadixSort {
    public static int getMax(int[] a,int n){
        int max=Integer.MIN_VALUE;
        
        for(int i=0;i<n;i++){
            if(a[i]>max){
                max=a[i];
            }
        }
        return max;
    }
    
    
    public static void countSort(int[] a,int n,int exp){
        
        int result[]=new int[n];
        int count[]=new int[10];
        
        Arrays.fill(count, 0);
        for(int i=0;i<n;i++){
            count[(a[i]/exp)%10]++;
        }
        
        for(int i=1;i<10;i++){
            count[i]+=count[i-1];
        }
        for(int i=n-1;i>=0;i--){
            result[count[(a[i]/exp)%10]-1]=a[i];
            count[(a[i]/exp)%10]--;
        }
        
        for(int i=0;i<n;i++){
            a[i]=result[i];
        }
        
        
    }
    
  
    public static void radixSort(int[] a,int n){
        int max=getMax(a,n);
        
        for(int exp=1;max/exp>0;exp*=10){
            countSort(a,n,exp);
        }
    }
    public static void main(String[] args) {
        int[] a={4,2,6,1,67,30,32};
        int n=a.length;
        radixSort(a,n);
        
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }
}
