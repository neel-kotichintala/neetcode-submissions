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
    public int kthSmallest(TreeNode root, int k) {
        // in order traversal LNR
        // call method on left of root
        // at each node, check if k = 0, if it is, then return node.val
        // if its not, then subtract 1 from k and call method on right of root

        if (root == null) {
            return -1;
        }

        kthSmallest(root.left, k);
        if (k == 1) {
            return root.val;
        }
        return kthSmallest(root.right, --k);
    }
}
