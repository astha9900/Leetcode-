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
    public boolean isPalindrome(ListNode head) {
        if(head==null&&head.next==null){
            return true;
        }
        ListNode slow=head;
        ListNode fast=head;
        while(fast.next!=null&&fast.next.next!=null){
            slow=slow.next;  ///+1
            fast=fast.next.next;//+2
        }
        ListNode mid=slow;
        ListNode prev=null;
        ListNode curr=mid;
        ListNode next;
        while(curr!=null){
            next =curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        ListNode right=prev;
        ListNode left=head;
        while(right.next!=null){
            if (left.val!= right.val){
                return false;
            }
            left=left.next;
            right=right.next;
        }
        return true;
        
    }
}