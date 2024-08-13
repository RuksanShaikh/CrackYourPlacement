public class LLIntersection {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA==null ||headB==null){
            return null;
        }
        ListNode nodeA=headA;
        ListNode nodeB=headB;
        int count=0;
        while(nodeA!=nodeB){
            if(count==2)break;

            if(nodeA==null)count++;
            nodeA=nodeA==null?headB:nodeA.next;
            nodeB=nodeB==null?headA:nodeB.next;
        }

        return (nodeA==nodeB)?nodeA:null;
    }
}