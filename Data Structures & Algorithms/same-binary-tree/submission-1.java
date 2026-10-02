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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        // bfs search on both trees at the same time
        // first check if both nodes exist
        // then check if values match
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(p);
        queue.offer(q);

        while (!queue.isEmpty()) {
            // pop the first two, first one is p tree, second is q tree
            TreeNode one = queue.poll();
            TreeNode two = queue.poll();

            if (one == null && two == null) {
                continue;
            }

            // compare
            if ((one == null && two != null) ||
                (one != null && two == null)) {
                    return false;
                }
            
            if (one.val != two.val) {
                return false;
            }

            queue.offer(one.left);
            queue.offer(two.left);
            queue.offer(one.right);
            queue.offer(two.right);
        }

        return true;
    }
}
