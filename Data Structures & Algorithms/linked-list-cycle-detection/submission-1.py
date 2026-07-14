# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

class Solution:
    def hasCycle(self, head: Optional[ListNode]) -> bool:
        nodesSeen = set()
        curr = head

        while curr:
            if curr in nodesSeen:
                return True
            else:
                nodesSeen.add(curr)
            curr = curr.next

        return False