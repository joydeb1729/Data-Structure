# Linked List Problem Solutions

## Problem 4: Remove Nodes with Greater Value on the Right

**Question:**
You are given the head of a linked list. Remove every node that has a node with a greater value anywhere to the right side of it. 

**Operations:**
- **Remove Nodes**: The goal is to eliminate nodes that have a greater value on their right, ensuring the remaining list is sorted in decreasing order.
- **Linked List Traversal**: Traverse the list from right to left, removing nodes that are smaller than any node encountered so far. The result will naturally be sorted in decreasing order.
- **Result**: The list is updated so that every node has no greater node to its right, and the final list is sorted in decreasing order.

**Solution Explanation:**
- We reverse the linked list to process it from the end to the beginning.
- While traversing, we keep track of the maximum node encountered. Any node with a value smaller than this maximum is removed.
- After processing, the reversed list naturally becomes sorted in decreasing order without needing an additional sorting step.
- This approach ensures that the final list contains only the largest nodes in decreasing order, with all smaller nodes on the right removed.

