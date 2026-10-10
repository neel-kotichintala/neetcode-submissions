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
        if (root == null) {
            return true;
        }
        
        int main = root.val;

        if ((root.left != null && root.val <= root.left.val) ||
            (root.left != null && root.left.val == main) ||
            (root.right != null && root.val >= root.right.val) ||
            (root.right != null && root.right.val == main)) {
            return false;
        }

        return isValidBST(root.left) && isValidBST(root.right);
    }
}
