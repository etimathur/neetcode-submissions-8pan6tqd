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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        int i = 1;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode leftN = dummy;
        while(i < left)
        {
            leftN = head;
            head = head.next;
            i++;
        }
        ListNode prev = null;
        ListNode curr = head;
        for(i = left; i <= right; i++){
            ListNode t = curr.next;
            curr.next = prev;
            prev = curr;
            curr = t;

        }
        leftN.next.next = curr;
        leftN.next = prev;

        return dummy.next;
    }
}