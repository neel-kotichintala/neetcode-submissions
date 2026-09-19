/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        // interweave
        Node l1 = head;
        while (l1 != null) {
            Node l2 = new Node(l1.val); //copy val
            l2.next = l1.next;
            l1.next = l2;
            l1 = l2.next; //skip the newly inserted node
        }

        // connect randoms
        l1 = head;
        while (l1 != null) {
            if (l1.random != null) {
                l1.next.random = l1.random.next;
            }
            l1 = l1.next.next;
        }

        // unweave

        l1 = head;
        Node newHead = l1.next;
        while (l1 != null) {
            Node l2 = l1.next;
            l1.next = l2.next;
            if (l2.next != null) {
                l2.next = l2.next.next;
            }
            l1 = l1.next;
        }
        
        return newHead;
    }
}
