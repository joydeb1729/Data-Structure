# Linked List Problem Solutions

## Problem 3: Remove Duplicates from a Sorted Singly Linked List

**Question:**
Given the head of a sorted singly linked list, delete all duplicates such that each element appears only once.

**Operations:**
- **Duplicate Removal**: The task is to traverse the sorted list and remove nodes that have duplicate values, ensuring each value appears only once in the final list.
- **Linked List Traversal**: Starting from the head of the list, we compare each node with the next one. If two consecutive nodes have the same value, the next node is skipped.
- **Result**: The final list contains only unique elements.

**Solution Explanation:**
- We iterate through the list with a pointer starting from the head.
- For each node, we check if its value matches the next node's value. If they are the same, we skip the next node by adjusting the current node’s `next` pointer to bypass the duplicate.
- This process continues until we reach the end of the list.
- Since the list is sorted, this approach efficiently removes duplicates without needing extra space or a more complex algorithm.
