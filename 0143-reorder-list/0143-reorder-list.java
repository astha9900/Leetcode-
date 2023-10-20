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
    public void reorderList(ListNode head) {
        //1)To find the mid node
        ListNode slow=head;
        ListNode fast=head.next;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode mid=slow;
        //2)To reverse the second half list
        ListNode curr=mid.next;
        mid.next=null;
        ListNode prev=null;
        ListNode next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        ListNode left=head;
    	ListNode right=prev;
    	ListNode nextL,nextR;
    	//alt merge-zig-zag merge
    	while(left!=null&&right!=null) {
    		nextL=left.next;
    		left.next=right;
    		nextR=right.next;
    		right.next=nextL;
    		left=nextL;
    		right=nextR;
        }    
    }
}