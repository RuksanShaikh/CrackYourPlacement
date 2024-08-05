import java.util.*;
class MinimumCost {
    
    public static int minCost(int[] coins,int n,int k){
        Arrays.sort(coins);
        int ans=0;
        int coins_req=(int)Math.ceil(1.0*n/(k+1));
        
        for(int i=0;i<=coins_req-1;i++){
            ans+=coins[i];
        }
        return ans;
    }
    public static void main(String[] args) {
       int coin[] ={100, 20, 50, 10, 2, 5}; 
       int n=coin.length;

       int k = 3;
       System.out.println(minCost(coin,n,k));
        
    }
}