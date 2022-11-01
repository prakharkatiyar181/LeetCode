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
        ArrayList<Integer> a1=new ArrayList<Integer>();
        inorder(root,a1);
        return a1;
    }
    public void inorder(TreeNode root,ArrayList<Integer>a1)
    {
        if(root==null)
            return;
        inorder(root.left,a1);
        a1.add(root.val);
        inorder(root.right,a1);
    }
}