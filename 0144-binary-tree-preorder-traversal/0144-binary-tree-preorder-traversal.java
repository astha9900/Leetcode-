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
    public List<Integer> preorderTraversal(TreeNode root) {
        if (root==null){
            return new ArrayList<>();

        }
        ArrayList<Integer> a=new ArrayList<>();
        a.add(root.val);
        a.addAll(preorderTraversal(root.left));
        a.addAll(preorderTraversal(root.right));
        return a;
    }
}