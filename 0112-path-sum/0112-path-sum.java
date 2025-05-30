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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null)return false;
        return sum(root,0,targetSum);
    }

    private boolean sum(TreeNode root,int current,int targetSum){
        if(root==null) return false;
        if(root.left==null && root.right==null){
            return root.val+current==targetSum;
        }
        return sum(root.left,current+root.val,targetSum) || sum(root.right,current+root.val,targetSum);
    }
}