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
    public ListNode partition(ListNode head, int x) {
        if(head == null || head.next == null)
            return head;
        ListNode smaller = new ListNode(-1),greater = new ListNode(-1),curr1 = smaller,curr2 = greater,temp = head;
        while(temp!=null)
        {
            if(temp.val < x)
            {
                curr1.next = temp;
                curr1 = curr1.next;
            }
            else
            {
                curr2.next = temp;
                curr2 = curr2.next;
            }
            temp = temp.next;
        }
        curr2.next = null;
        curr1.next = greater.next;
        return smaller.next;
    }
}