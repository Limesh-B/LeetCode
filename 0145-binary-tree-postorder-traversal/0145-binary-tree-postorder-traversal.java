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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> li = new ArrayList<>();
        postOrder(root,li);
        return li;
    }

    public static void postOrder(TreeNode node,List<Integer> li){
        if(node==null)
            return ;

        postOrder(node.left,li);
        postOrder(node.right,li);
        li.add(node.val);
    }
}
