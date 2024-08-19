class RemoveFromNthEnd {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode fast=head;
        ListNode slow=head;

        while(n>0){
            fast=fast.next;
            if(fast==null){
                return head.next;
            }
            n--;
        }

        while(fast.next!=null){
            slow=slow.next;
            fast=fast.next;
        }
        slow.next=slow.next.next;

        return head;
    }
}