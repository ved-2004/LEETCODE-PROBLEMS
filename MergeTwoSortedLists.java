public class MergeTwoSortedLists {
    class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head = null;
        ListNode curr = head;
        ListNode newNode;
        while(list1!=null && list2!=null)
        {
            if(list1.val<list2.val)
            {
                newNode = new ListNode(list1.val,null);
                if(head == null)
                {
                    head = newNode;
                    curr = head;
                }
                else
                {
                    curr.next = newNode;
                    curr = curr.next;
                }
                list1 = list1.next;
            }
            else
            {
                newNode = new ListNode(list2.val,null);
                if(head == null)
                {
                    head = newNode;
                    curr = head;
                }
                else
                {
                    curr.next = newNode;
                    curr = curr.next;
                }
                list2 = list2.next;
            }
        }
        while(list1!=null)
        {
            newNode = new ListNode(list1.val,null);
            if(head == null)
            {
                head = newNode;
                curr = head;
            }
            else
            {
                curr.next = newNode;
                curr = curr.next;
            }
            list1 = list1.next;
        }
        while(list2!=null)
        {
            newNode = new ListNode(list2.val,null);
            if(head == null)
            {
                head = newNode;
                curr = head;
            }
            else
            {
                curr.next = newNode;
                curr = curr.next;
            }
            list2 = list2.next;
        }
        return head;
    }
}
