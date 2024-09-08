class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int size=0;
        ListNode temp=head;
        while(temp!=null){
            temp=temp.next;
            size++;
        }
        if(size-n==0){
            return head.next;
        }
        int i=1;
        ListNode prev=head;
        while(i<size-n){
            prev=prev.next;
            i++;
        }
        prev.next=prev.next.next;
        return head;
        
        
    }
}