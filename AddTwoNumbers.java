public class AddTwoNumbers {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = null;
        ListNode curr = null;
        int sum = 0;
        int carry = 0;
        while(l1!=null && l2!=null)
        {
            sum = l1.val + l2.val + carry;
            carry = sum/10;
            sum = sum%10;
            ListNode newNode = new ListNode(sum,null);
            if(head==null)
            {
                head = newNode;
                curr = head;
            }
            else
            {
                curr.next = newNode;
                curr = newNode;
            }
            l1 = l1.next;
            l2 = l2.next;
        }
        while(l1!=null)
        {
            sum = l1.val + carry;
            carry = sum/10;
            sum = sum%10;
            ListNode newNode = new ListNode(sum,null);
            if(head==null)
            {
                head = newNode;
                curr = head;
            }
            else
            {
                curr.next = newNode;
                curr = newNode;
            }
            l1 = l1.next;
        }
        while(l2!=null)
        {
            sum = l2.val + carry;
            carry = sum/10;
            sum = sum%10;
            ListNode newNode = new ListNode(sum,null);
            if(head==null)
            {
                head = newNode;
                curr = head;
            }
            else
            {
                curr.next = newNode;
                curr = newNode;
            }
            l2 = l2.next;
        }
        if(carry>0)
        {
            ListNode newNode = new ListNode(carry,null);
            curr.next = newNode;
        }
        return head;
    }
}
