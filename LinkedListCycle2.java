/*
Solution - The first half includes solving it like linked list cycle 1 or like the problem - Whether a linked list is cyclic or not,
i.e. using slow,fast pointer method.
Here, there are many possibilities when slow = fast, it might be at start of cycle or somewhere in middle of cycle or at the end.
To solve this, you again start traversing the linked list from head. Simultaneously, increment slow pointer.
The node where both pointers meet, is the node where cycle begins, so return that.
You can remove the if condition checking slow = head. Keeping it will solve some test-cases fast, and in less space(curr not used)
These are the cases where a cyclic linked list is given
 */
public class LinkedListCycle2 {
    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }
    public ListNode detectCycle(ListNode head) {
        if(head == null || head.next == null)
            return null;
        ListNode slow = head.next;
        ListNode fast = head.next.next;
        while(slow!=fast)
        {
            if(slow==null || fast == null || fast.next==null)
                return null;
            slow = slow.next;
            fast = fast.next.next;
        }
        if(slow==head)
            return head;
        else
        {
            ListNode curr = head;
            while(curr!=slow)
            {
                curr=curr.next;
                slow=slow.next;
            }
            return curr;
        }
    }
}
