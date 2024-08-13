/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class AddSumII {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // Get the size of the two lists.
        int size1 = getLength(l1), size2 = getLength(l2);
        ListNode head = new ListNode(1);    // Assume current node is 1, we will check is next node is over 10.
        head.next = size1 > size2 ? createNext(l1, l2, size1 - size2): createNext(l2, l1, size2 - size1);
        if(head.next.val > 9){
            head.next.val %= 10;
            return head;
        }
        return head.next;
    }
    private int getLength(ListNode node){
        int count = 0;
        while(node != null){
            count++;
            node = node.next;
        }
        return count;
    }
    private ListNode createNext(ListNode l1, ListNode l2, int offset){
        if(l1 == null) return null;
        // Create current node.
        ListNode result = offset == 0 ? new ListNode(l1.val + l2.val): new ListNode(l1.val);
        // Create next node.
        ListNode next = offset == 0 ? createNext(l1.next, l2.next, 0): createNext(l1.next, l2, offset - 1);
        result.next = next;
        if(next != null && next.val > 9){
            next.val %= 10;
            result.val += 1;
        }
        return result;
    }
}