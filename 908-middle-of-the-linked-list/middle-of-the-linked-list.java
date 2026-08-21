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
    public ListNode middleNode(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}

class Solution1 {
    public ListNode middleNode(ListNode head) {
        ListNode temp = head;
        int c = 0;
        while (temp != null) {
            c++;
            temp = temp.next;
        }
        temp = head;
        for (int k = 1; k < c; k++) {
            if (k == (c / 2) + 1)
                break;
            temp = temp.next;
        }
        return temp;
    }
}