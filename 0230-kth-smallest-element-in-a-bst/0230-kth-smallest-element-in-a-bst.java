class Solution {
    public void inorder(List<Integer>l,TreeNode root){
        if(root==null) return;
        inorder(l,root.left);
        l.add(root.val);
        inorder(l,root.right);
    } 
    public int kthSmallest(TreeNode root,int k){
        List<Integer>l=new ArrayList<>();
        inorder(l,root);
        return l.get(k-1);
    }
}