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
    public ListNode oddEvenList(ListNode head) {
    if(head == null || head.next == null)
    return head;
      ListNode even = head.next;
      ListNode odd = head;
      ListNode headeven = even;
      while(odd.next != null && odd.next.next != null){
           odd.next = even.next;
           odd = odd.next;
           even.next = odd.next;
           even = even.next;
         }
    odd.next = headeven;
    return head;
    }
}

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
    public ListNode oddEvenList(ListNode head) {
    if(head == null || head.next == null)
    return head;
      ListNode even = head.next;
      ListNode odd = head;
      ListNode headeven = even;
      while(even != null && even.next != null){
           odd.next = even.next;
           odd = odd.next;
           even.next = odd.next;
           even = even.next;
         }
    odd.next = headeven;
    return head;
    }
}