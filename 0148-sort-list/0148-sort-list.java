class Solution {
    public ListNode sortList(ListNode head) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        ListNode temp=head;
        int i=0;
        while(head!=null){
            pq.add(head.val);
            i++;
            head=head.next;
        }
        ListNode ans=new ListNode(-1);
        ListNode result=ans;
        while(!pq.isEmpty()){
            ListNode p=new ListNode(pq.poll());
            result.next=p;
            result=result.next;
        }
        return ans.next;
        
    }
}