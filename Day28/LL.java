class LL{
    Node head;
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
        
    }
    
    public void seggregate(){
        Node evenStart=null;
        Node evenEnd=null;
        Node oddStart=null;
        Node oddEnd=null;
        Node currNode=head;
        while(currNode!=null){
            int val=currNode.data;
            if(val%2==0){
                if(evenStart==null){
                    evenStart=currNode;
                    evenEnd=evenStart;
                }
                else{
                    evenEnd.next=currNode;
                    evenEnd=evenEnd.next;
                }
                
            }
            else{
                if(oddStart==null){
                    oddStart=currNode;
                    oddEnd=oddStart;
                }
                else{
                    oddEnd.next=currNode;
                    oddEnd=oddEnd.next;
                }
            }
            
            currNode=currNode.next;
        }
        
        if(oddStart==null||evenStart==null){
            return;
        }
        
        evenEnd.next=oddStart;
        oddEnd.next=null;
        head=evenStart;
    }
    
    public void push(int new_data){
        Node new_node=new Node(new_data);
        new_node.next=head;
        head=new_node;
    }
    
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ->");
            temp=temp.next;
        }
        
        System.out.println();
    }
    
    public static void main(String args[]){
        LL list=new LL();
        list.push(11);
        list.push(10);
        list.push(9);
        list.push(6);
        list.push(7);
        list.push(2);
        System.out.println("Orginal Linked List");
        list.display();
        list.seggregate();
        System.out.println("Modified Linked List");
        list.display();
    }
}