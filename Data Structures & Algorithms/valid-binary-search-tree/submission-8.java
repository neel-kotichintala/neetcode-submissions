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
    public boolean isValidBST(TreeNode root) {
        return valid(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private boolean valid(TreeNode node, long left, long right) {
        // left and right are the current bounds
        // check if node is null
        // then check if node.val is between left and right
        // then return true if both left and right sub tree are true
        if (node == null) {
            return true;
        }

        if (!(left < node.val && right > node.val)) {
            return false;
        }

        return valid(node.left, left, node.val) && valid(node.right, node.val, right);
    }
}
