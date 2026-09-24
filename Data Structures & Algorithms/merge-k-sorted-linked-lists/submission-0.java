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
    public ListNode mergeKLists(ListNode[] lists) {
        // use priority queue, min-heap
        // add heads of every list to the queue
        // keep popping, for every pop, add the next node in that 
        // popped node's list to the queue.
        PriorityQueue<ListNode> pq = new PriorityQueue<>((a, b) -> a.val - b.val);

        for (ListNode list : lists) {
            if (list != null) {
                pq.offer(list);
            }
        }
        
        if (pq.isEmpty()) {
            return null;
        }

        ListNode res = new ListNode();
        ListNode curr = new ListNode();
        res.next = curr;
        while (!pq.isEmpty()) {
            ListNode min = pq.poll();
            curr.val = min.val;

            if (min.next != null) {
                pq.offer(min.next);
            }
            if (pq.isEmpty()) {
                break;
            }

            ListNode next = new ListNode();
            curr.next = next;
            curr = next;
        }

        return res.next;
    }
}
