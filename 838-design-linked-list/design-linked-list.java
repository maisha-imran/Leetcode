class MyLinkedList {
    // Node class
    class Node {
        int val;
        Node next;
    Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }
    Node head;
    public MyLinkedList() {
        head = null;
    }
    public int get(int index) {
        Node temp = head;
        int c=0;
        while( temp != null){
            if( c == index)
                return temp.val;
            temp = temp.next;
            c++;
        }
        return -1;
    }
    
    public void addAtHead(int val) {
        head = new Node( val , head);
    }
    
    public void addAtTail(int val) {
        if( head == null){
            addAtHead(val);
            return;
        }
        Node temp = head;
        while( temp.next != null){
            temp = temp.next;
        }
        temp.next = new Node(val , null);
    }
    
    public void addAtIndex(int index, int val) {
        if( index == 0){
            addAtHead(val);
            return;
        }
        Node temp = head;
        int c=1;
        while(temp !=null){
            if( c == index )
                break;
            temp = temp.next;
            c++;
        }
        if( temp ==null)
            return;
        temp.next= new Node( val , temp.next);
    }
    
    public void deleteAtIndex(int index) {
        if( head == null )
            return;
        if ( index == 0){
            head = head.next;
            return;
        }
        Node temp = head;
        int c=1;
        while( temp != null){
            if ( c==index)
                break;
            temp = temp.next;
            c++;
        }
        if (temp == null || temp.next == null)
            return;
        temp.next = temp.next.next;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */