# Linked List Problem Solutions

## Problem 1: Find the Middle Node in a Doubly Linked List

**Question:**
Describe a method for finding the middle node of a doubly linked list with header and trailer sentinels by “link hopping,” and without relying on explicit knowledge of the size of the list. In the case of an even number of nodes, report the node slightly left of center as the “middle.”

**Operations:**
- **Link Hopping**: The method does not use the size of the list. Instead, it uses two pointers, starting from the header and trailer sentinels, moving towards each other one node at a time.
- **Middle Node**: When the two pointers meet or cross, the node reached by the left pointer (starting from the header) is reported as the middle node. In the case of an even number of nodes, the left node is considered the middle.

**Solution Explanation:**
- We use two pointers: one starting from the first node after the header and another from the last node before the trailer.
- Both pointers move towards the center by hopping one node forward for the left pointer and one node backward for the right pointer.
- Once the pointers meet or cross, the left pointer points to the "middle" node.
- This approach ensures that the solution works for both odd and even-sized lists without requiring the list size.

