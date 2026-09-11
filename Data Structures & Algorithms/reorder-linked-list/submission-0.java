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
    public void reorderList(ListNode head) {
        // use fast and slow pointers, fast will be at the end when slow is middle
        // reverse slow + 1 to fast linked list
        // combine the two linked lists

        ListNode slow = head;
        ListNode fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        if (fast.next != null) {
            fast = fast.next;  //make sure fast is at the end
        }

        ListNode second = slow.next; // slow + 1 start of second half
        slow.next = null; // set end of first half to null
        ListNode prev = null;
        while (second != null) {
            ListNode temp = second.next;
            second.next = prev;
            prev = second;
            second = temp;
        }

        ListNode list1 = head; // first half
        ListNode list2 = prev; // second half

        while (list1 != null  && list2 != null) {
            ListNode temp1  = list1.next;
            ListNode temp2 = list2.next;
            list1.next = list2;
            list2.next = temp1;
            list1 = temp1;
            list2 = temp2;
        }
    }
}
