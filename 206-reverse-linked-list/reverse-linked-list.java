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
class Solution1 {
    public ListNode reverseList(ListNode head) {
        ListNode prev=null;
        ListNode mover= head;
        while(mover!=null){
            ListNode temp=mover.next;
            mover.next=prev;
            prev=mover;
            mover=temp;
        }
        return prev;
    }
}

class Solution {
    public ListNode reverseList(ListNode head) {
        Stack <Integer> st = new Stack<>();
        ListNode temp = head;
        while( temp != null){
            st.add(temp.val);
            temp = temp.next;
        }
        temp = head;
        while( !(st.isEmpty())){
            temp.val = st.pop();
            temp = temp.next;
        }
    return head;
    }
}

