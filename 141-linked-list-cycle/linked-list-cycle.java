

public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode temp= head;
        HashMap<ListNode , Integer> map = new HashMap<>();
        while(temp!=null){
            if(map.containsKey(temp))
                return true;
        map.put(temp , 1);
        temp=temp.next;
        }
    return false;
    }
}


