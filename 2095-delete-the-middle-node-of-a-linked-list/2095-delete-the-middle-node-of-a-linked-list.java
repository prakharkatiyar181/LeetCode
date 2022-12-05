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
    public ListNode deleteMiddle(ListNode head) {
        if(head.next == null) {
            return null;
        }
        ListNode node1 = head;
        ListNode node2 = head;
        ListNode prev = head;
        while(node2 != null && node2.next != null) {
            prev=node1;
            node1=node1.next;
            node2=node2.next.next;
        }
        prev.next=node1.next;
        return head;
    }
}