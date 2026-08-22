/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
// public class Solution1 {
//     public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
//         ListNode temp1 = headA;
//         ListNode temp2 = headB;
//         int c1 = 0, c2 = 0;
//         while (temp1 != null) {
//             c1++;
//             temp1 = temp1.next;
//         }
//         while (temp2 != null) {
//             c2++;
//             temp2 = temp2.next;
//         }
//         if (c1 > c2) {
//             while (c1 - c2 > 0) {
//                 headA = headA.next;
//                 c1--;
//             }
//         } else {
//             while (c2 - c1 > 0) {
//                 headB = headB.next;
//                 c2--;
//             }
//         }
//         while (headA != null) {
//             if (headA == headB)
//                 return headA;
//             headA = headA.next;
//             headB = headB.next;
//         }
//         return null;
//     }
// }

public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode a = headA;
        ListNode b = headB;

        while (a != b) {

            if (a == null)
                a = headB;
            else
                a = a.next;

            if (b == null)
                b = headA;
            else
                b = b.next;
        }

        return a;
    }
}