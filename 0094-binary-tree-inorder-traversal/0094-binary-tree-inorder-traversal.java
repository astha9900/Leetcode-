/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> a=new ArrayList<>();
        if(root==null){
            return new ArrayList<>();
        }
        a.addAll(inorderTraversal(root.left));
        a.add(root.val);
        a.addAll(inorderTraversal(root.right));
        return a;
    }
}