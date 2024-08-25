class MaxSwap
{
    //Function to find the largest number after k swaps.
    public static String findMaximumNum(String str, int k)
        {
            //code here.
            String[] max=new String[1];
            max[0]=str;
            
            findMaximumNumHelper(str,k,max);
            return max[0];
            
        }
        
        private static void findMaximumNumHelper(String str,int k,String[] max){
            
            
             if(k==0){
                 return;
             }
            
           
            
            int n=str.length();
            
            for(int i=0;i<n-1;i++){
                for(int j=i+1;j<n;j++){
                    if(str.charAt(i)<str.charAt(j)){
                        str=swap(str,i,j);
                        
                        if(str.compareTo(max[0])>0){
                            max[0]=str;
                        }
                        
                        findMaximumNumHelper(str,k-1,max);
                        
                        str=swap(str,i,j);
                    }
                }
            }
        }
        
        private static String swap(String str, int i, int j) {
        char[] charArray = str.toCharArray();
        char temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }
}