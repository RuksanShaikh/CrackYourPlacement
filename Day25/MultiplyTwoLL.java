class MultiplyTwoLL {
    public long multiplyTwoLists(Node first, Node second) {
        // Code here
        long n=1000000007;
        long num1=0;
        long num2=0;
    
    while(first!=null ||second!=null){
        if(first!=null){
            num1=(num1*10)%n+first.data;
            first=first.next;
        }
        
        if(second!=null){
            num2=(num2*10)%n+second.data;
            second=second.next;
        }
    
    }