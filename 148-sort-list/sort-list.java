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
    public ListNode sortList(ListNode head) {
      ArrayList<Integer> list = new ArrayList<>();
      ListNode temp = head;
      while( temp != null){
        list.add(temp.val);
        temp = temp.next;
      } 
      Collections.sort(list);
      temp = head;
      for(int i=0; i< list.size(); i++){
          temp.val = list.get(i);
          temp = temp.next;
          }
      return head;
    }
}

class Solution {
    private ListNode mergeSort( ListNode l1 , ListNode l2){
        ListNode ptr = new ListNode(0);
        ListNode headnew = ptr;
        while( l1 != null && l2 !=null ){
            if( l1.val < l2.val){
                ptr.next = l1;
                l1 = l1.next;
            }
            else{
                ptr.next = l2;
                l2 = l2.next;
            }
            ptr = ptr.next;
        }
        if( l1 == null){
            while( l2 != null){
                ptr.next = l2;
                l2 = l2.next;
                ptr = ptr.next;
            }
        }
        else{
            while( l1 != null){
            ptr.next = l1;
            l1 = l1.next;
            ptr = ptr.next;
            }
        }
        return headnew.next;
    }
    public ListNode sortList(ListNode head) {
        ListNode slow = head, fast = head;
        ListNode prev = null;
        if( head == null || head.next == null)  
            return head;
        while( fast != null && fast.next != null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        prev.next = null;
        return mergeSort( sortList(slow) , sortList(head));
    }
}
