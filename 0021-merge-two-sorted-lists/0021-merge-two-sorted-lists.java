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
    public ListNode smallerNode(ListNode node1, ListNode node2)
    {
        if(node1.val <= node2.val)
            return node1;
        else
            return node2;
    }
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode temp = null;
        ListNode ans = null;
        // if(list1 == null && list2 == null)
        //     return ans;
        if(list1 == null) 
            return list2;
            
        if(list2 == null) 
            return list1;
        
        if(list1.val<=list2.val) {
            ans = list1;
            temp = list1;
            list1 = list1.next;
        } else {
            ans = list2;
            temp = list2;
            list2 = list2.next;
        }
            
        while(list1 != null && list2 != null)
        {
            if(list1.val<=list2.val)
            {
                // temp=smallerNode(list1, list2);
                ans.next = list1;
                ans = ans.next;
                list1 = list1.next;
                // ans=temp;
            }
            else if(list1.val>list2.val)
            {
                // temp=smallerNode(list1, list2);
                ans.next = list2;
                ans = ans.next;
                list2 = list2.next;
                // ans=temp;
            }
            // temp=null;
            // ans.next=temp;
            // System.out.println(ans.val + " ");
        }
        while(list1!=null)
        {
            ans.next=list1;
            ans = ans.next;
            list1 = list1.next;
        }
        while(list2!=null)
        {
            ans.next=list2;
            ans = ans.next;
            list2 = list2.next;
        }
        System.out.println(ans.val + " ");
        
        return temp;
    }
}