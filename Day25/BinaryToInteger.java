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
class BinaryToInteger {
    public int getDecimalValue(ListNode head) {
        if(head==null){
            return 0;
        }
        int result=0;
        while(head!=null){
            result=(result*2)+head.val;
            head=head.next;
        }
        return result;
    }
}