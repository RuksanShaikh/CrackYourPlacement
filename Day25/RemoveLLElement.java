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
class RemoveLLElement {
  public ListNode removeElements(ListNode head, int val) {
    ListNode dup = new ListNode(0, head);
    ListNode prev = dup;

    for (; head != null; head = head.next)
      if (head.val != val) {
        prev.next = head;
        prev = prev.next;
      }
    prev.next = null;//if last node value equal to val

    return dup.next;
  }
}