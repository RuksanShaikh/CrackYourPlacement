class FlattenDLL {
    public Node flatten(Node head) {
        return flatten(head,null);
    }

    Node flatten(Node head,Node rest){
        if(head==null)
          return rest;

          head.next=flatten(head.child,flatten(head.next,rest));
          if(head.next!=null){
            head.next.prev=head;
          }
           head.child=null;
           return head;  
          
    }
}