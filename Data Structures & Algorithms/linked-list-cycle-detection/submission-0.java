/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public boolean hasCycle(ListNode head) {
        HashSet<ListNode> nodesSeen = new HashSet<ListNode>();
        nodesSeen.add(head);
        ListNode curr = head;

        while (curr.next != null)
        {
            curr = curr.next;
            if (nodesSeen.contains(curr))
            {
                return true;
            }
            else
            {
                nodesSeen.add(curr);
            }
        }
        return false;
    }
}
