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
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if( head == null || k == 0 || head.next == null)
            return head;
        ListNode temp = head;
        int n = 1;
        while( temp.next != null){
            n++;
            temp = temp.next;
        }
        k = k % n;
        if( head == null || k == 0 || head.next == null)
            return head;
        ListNode mover = head;
        ListNode prev = null;
        int c = 0;
        while( c < (n-k)){
            prev = mover;
            mover = mover.next;
            c++;
        }
        prev.next = null;
        temp.next = head;
        return mover;

    }
}