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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // use two pointers
        // keep left pointer at first node,
        // move right pointers until r-l = n
        // then move both pointer at teh same time until r reaches the last node.
        // the Nth node from the end will be at the l + 1

        int l = 1;
        int r = 1;

        ListNode curr = head;
        while (r != n) {
            curr = curr.next;
            r++;
        }

        ListNode left = head;
        ListNode right = curr;
        ListNode prev = null;

        while (right.next != null) {
            prev = left;
            left = left.next;
            right = right.next;
        }

        ListNode rem = left; // removing this node

        if (rem == head) {
            ListNode temp = head.next;
            rem.next = null;
            return temp;
        }
        
        prev.next = rem.next;
        rem.next = null;

        return head;

    }
}
