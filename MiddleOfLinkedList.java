public class MiddleOfLinkedList {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode middleNode(ListNode head) {
        ListNode curr = head;
        int n = 0;
        while(curr!=null)
        {
            n++;
            curr = curr.next;
        }
        curr = head;
        for(int i=0;i<n/2;i++)
        {
            curr = curr.next;
        }
        return curr;
    }
}
