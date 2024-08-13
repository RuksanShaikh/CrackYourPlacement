class AddNumber {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dup=new ListNode(0);
        ListNode curr=dup;
        int carry=0;
    
        while(l1!=null || l2!=null){
            int sum=0;
            if(l1!=null && l2!=null){

                sum=l1.val+l2.val+carry;
                l1=l1.next;
                l2=l2.next;
            }
            else if(l1!=null){
                sum=l1.val+carry;
                l1=l1.next;
            }else{
                sum=l2.val+carry;
                l2=l2.next;
            }

            curr.next=new ListNode(sum%10);
            carry=sum/10;
            curr=curr.next;
        }

        if(carry==1)curr.next=new ListNode(1);
        return dup.next;

    }
}