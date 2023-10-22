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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if(head.next==null&&head==null){
            return head;
        }
        ListNode slow=head;
        ListNode fast=head.next;
        while(fast!=null){
            int n=Math.min(slow.val,fast.val);
            int data=0;
            for(int i=1;i<=n;i++){
                if(slow.val%i==0&&fast.val%i==0){
                    data=i;
                }
            }
            ListNode temp=new ListNode(data);
            slow.next=temp;
            temp.next=fast;
            slow=fast;
            fast=fast.next;

        }
        return head;
        
    }
}