/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class ReverseLLII {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(left==1){
            return reverseLL(head,right);
        }

        head.next=reverseBetween(head.next,left-1,right-1);
        return head;
    }

    public ListNode reverseLL(ListNode head,int n){
        if(n==1)
        return head;

        ListNode newHead=reverseLL(head.next,n-1);
        ListNode headNext=head.next;
        head.next=headNext.next;
        headNext.next=head;

        return newHead;
    }
}