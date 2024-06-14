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
    public boolean isId(TreeNode root, TreeNode subRoot){
        if(root==null&&subRoot==null){
            return true;
        }
        else if(root==null||subRoot==null||(root.val!=subRoot.val)){
            return false;
        }
        if(!isId(root.left,subRoot.left)){
            return false;
        }
        if(!isId(root.right,subRoot.right)){
            return false;
        }
        return true;

    }
    
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(root==null){
            return false;
        }
        if(root.val==subRoot.val){
            if(isId(root,subRoot)){
                return true;
            }
        }
        return isSubtree(root.left,subRoot)|| isSubtree(root.right,subRoot);
    }
}