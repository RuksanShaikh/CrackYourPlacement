
class ChocolateDistribution
{
    public long findMinDiff (ArrayList<Integer> a, int n, int m)
    {
        // your code here
        
        Collections.sort(a);
        if(m==0||n==0){
            return 0;
        }
        
        if(m>n){
            return -1;
        }
        long min=Integer.MAX_VALUE;
        
        for(int i=0;n>i+m-1;i++){
            int minDiff=a.get(i+m-1)-a.get(i);
            
            if(min>minDiff){
                min=minDiff;
            }
        }
        
        return min;
    }
}