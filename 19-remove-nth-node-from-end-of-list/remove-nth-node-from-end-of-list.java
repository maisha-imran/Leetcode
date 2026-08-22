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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int c = 0;
        ListNode temp = head;
        while (temp != null) {
            c++;
            temp = temp.next;
        }
        n = c - n + 1;
        if (n == 1)
            return head.next;
        temp = head;
        int k = 1;
        while (temp.next != null) {
            k++;
            if (k == n) {
                temp.next = temp.next.next;
                break;
            }
            temp = temp.next;
        }
        return head;
    }
}

class Solution1 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode slow = head, fast = head;
        while (n > 0) {
            fast = fast.next;
            n--;
        }
        if (fast == null)
            return head.next;
        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return head;
    }
}
