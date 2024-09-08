class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        int size=1;
        if(head==null||head.next==null){
            return head;
        }
        ListNode temp=head;
        while(temp.next!=null){
            temp=temp.next;
            size++;
        }
        k=k%size;
        int start=size-k;
        temp.next=head;
        while(start>0){
            temp=temp.next;
            start--;
        }
        head=temp.next;
        temp.next=null;
        return head;  
    }
}