class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp=head;
        int count=0;
        while(temp!=null&&count<k){
            temp=temp.next;
            count++;

        }
        if(count==k){
            temp=reverseKGroup(temp,k);
            while(count>0){
                ListNode nextNode=head.next;
                head.next=temp;
                temp=head;
                head=nextNode;
                count--;
            }
            head=temp;
        }
        return head;
    }
}