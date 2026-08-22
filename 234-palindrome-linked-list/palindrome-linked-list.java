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
class Solution2 {
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode temp = slow;
        ListNode prev = null;
        while (slow != null) {
            temp = slow.next;
            slow.next = prev;
            prev = slow;
            slow = temp;
        }
        fast = head;
        while (prev != null) {
            if (prev.val != fast.val)
                return false;
            prev = prev.next;
            fast = fast.next;
        }
        return true;
    }
}

class Solution1 {
    public boolean isPalindrome(ListNode head) {
        Stack<Integer> st = new Stack<>();
        ListNode temp = head;
        while (temp != null) {
            st.add(temp.val);
            temp = temp.next;
        }
        temp = head;
        while (!(st.isEmpty())) {
            if (temp.val != st.pop())
                return false;
            temp = temp.next;
        }
        return true;
    }
}

class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head, fast = head;
        Stack <Integer> st = new Stack<>();
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        fast = head;
        while( slow != null){
            st.add(slow.val);
            slow = slow.next;
        }
        while( !(st.isEmpty())){
            if( fast.val != st.pop())
                return false;
            fast = fast.next;
        }
        return true;
    }
}