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
    public TreeNode arrayToBst(int[] nums,int left,int right){
        if(left>right)
            return null;
        int mid=(left+right)/2;
        TreeNode temp=new TreeNode(nums[mid]);
        temp.left=arrayToBst(nums,left,mid-1);
        temp.right=arrayToBst(nums,mid+1,right);
        return temp;
    }
    public TreeNode sortedArrayToBST(int[] nums) {
        int left=0,right=nums.length-1;
        return arrayToBst(nums,left,right);
    }
}