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
    public List<List<Integer>> levelOrder(TreeNode root) {
        // so just use a queue and do bfs
        // so for each level you need to add 2^N nodes where n = 0, 1, 2...
        // if a node is null, dont add anything but increment the count
        // once you get to the 2^N (relative to the level), you need to make a new sublist
        if (root == null) {
            return new ArrayList();
        }

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        int i = 1; // index of the level
        int k = 1; // total possible nodes in that level
        
        List<List<Integer>> res = new ArrayList<>();
        while (!q.isEmpty()) {
            List<Integer> sub = new ArrayList<>();
            i = 1;
            while (i <= k) {
                TreeNode node = q.poll();
                if (node != null) {
                    sub.add(node.val);
                    q.offer(node.left);
                    q.offer(node.right);
                }
                i++;
            }
            if (!sub.isEmpty()) {
                res.add(sub);
            }
            k = k << 1;
        }

        return res;
    }
}
