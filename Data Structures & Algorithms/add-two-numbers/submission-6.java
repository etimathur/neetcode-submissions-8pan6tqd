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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0, null);
        ListNode head = dummy;
        int x = 0;
        while(l1 != null && l2 != null)
        {
            ListNode t1 = new ListNode();
            if((l1.val +l2.val + x) <= 9)
            {
                t1.val = l1.val +l2.val + x;
                x = 0;
            }
            else { 
                t1.val = (l1.val + l2.val +x) % 10;
                x = 1;
            }
            dummy.next = t1;
            dummy = t1;
            l1 = l1.next;
            l2 = l2.next;

        }
        while(l1 != null)
        {
            ListNode t = new ListNode();
            if(l1.val + x <= 9)
            {
                t.val = l1.val + x;
                x = 0;
            }
            else {
                t.val = (l1.val + x) % 10;
                x = 1;
            }
            dummy.next = t;
            dummy = t;
            l1 = l1.next;
        }
        while(l2 != null)
        {
            ListNode t = new ListNode(0, null);
            if(l2.val + x <= 9)
            {
                t.val = l2.val + x;
                dummy.next = t;
                x = 0;
            }
            else {
                t.val = (l2.val + x) % 10;
                x = 1;
                dummy.next = t;
            }
            dummy = t;
            l2 = l2.next;
        }
        if(x > 0)
        {
            ListNode l = new ListNode(1, null);
            dummy.next = l;
        }
        return head.next;
    }
}
