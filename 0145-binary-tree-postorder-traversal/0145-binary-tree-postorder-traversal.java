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
    public List<Integer> postorderTraversal(TreeNode root) {
        arr=new ArrayList<Integer>();
        helper(root);
        return arr;
    }
    public void helper(TreeNode root){
        if(root==null)
            return ;
        helper(root.left);
        helper(root.right);
        arr.add(root.val);
    }
}