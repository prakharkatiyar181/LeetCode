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
    List<Integer> arr;
    public void helper(TreeNode root){
        if(root==null){
            return ;
        }
        arr.add(root.val);
        helper(root.left);
        helper(root.right);
    }
    public List<Integer> preorderTraversal(TreeNode root) {
        arr = new ArrayList<Integer>();
        helper(root);
        return arr;
    }
    
}