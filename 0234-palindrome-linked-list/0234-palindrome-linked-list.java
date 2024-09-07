
class Solution {
    public boolean isPalindrome(ListNode head) {
        int arr[]=new int [100000];
        int size=0;
        if(head==null||head.next==null){
            return true;
        }
        while(head!=null){
            arr[size++]+=head.val;
            head=head.next;
        }
        int n=size/2;
        for(int i=0;i<n;i++){
            if(arr[i]!=arr[--size]){
                return false;
            }
        }
        return true;
        
    }
}