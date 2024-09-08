
class Solution {
    public ListNode partition(ListNode head, int x) {
        if(head==null||head.next==null){
            return head;
        }
        ListNode left=new ListNode(-1);
        ListNode right=new ListNode(-1);
        ListNode temp=left;
        ListNode curr=right;
        while(head!=null){
            if(head.val<x){
                temp.next=head;
                temp=temp.next;
            }
            else{
                curr.next=head;
                curr=curr.next;
            }
            head=head.next;
        }
        temp.next=right.next;
        curr.next=null;
        return left.next;
    }
}