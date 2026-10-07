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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        // if the two nodes are in the left subtree go left, if they are in the right subtree rlative to the current node, then go right. 
        // If its neither of these that means both are either of the 2:
        // 1. one is a parent of the other
        // 2. both are children of the current node
        // in either case you return the current



        TreeNode curr = root;
        while (curr != null) {
            if (curr.val > p.val && curr.val > q.val) {
                curr = curr.left;
            } else if (curr.val < p.val && curr.val < q.val) {
                curr = curr.right;
            } else {
                return curr;
            }
        }

        return null;
    }
}
