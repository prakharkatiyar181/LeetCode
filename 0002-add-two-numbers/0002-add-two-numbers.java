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
        ListNode curr=new ListNode();
        ListNode ans=curr;
        
        int carry=0;
        while(l1!=null&&l2!=null){
            int sum=0;
            sum=l1.val+l2.val+carry;
            l1=l1.next;
            l2=l2.next;
            carry=sum/10;
            ListNode temp=new ListNode(sum%10);
            ans.next=temp;
            ans=ans.next;
        }
        while(l1!=null){
            int sum=0;
            sum=l1.val+carry;
            l1=l1.next;
            carry=sum/10;
            ListNode temp=new ListNode(sum%10);
            ans.next=temp;
            ans=ans.next;
        }
        while(l2!=null){
             int sum=0;
            sum=l2.val+carry;
            l2=l2.next;
            carry=sum/10;
            ListNode temp=new ListNode(sum%10);
            ans.next=temp;
            ans=ans.next;
        }
        if(carry==1){
            ListNode temp=new ListNode(carry);
            ans.next=temp;
            ans=ans.next;
        }
        return curr.next;
    }
}