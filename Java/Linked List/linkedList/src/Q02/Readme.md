# Linked List Problem Solutions

## Problem 2: Merge Two Sorted Singly Linked Lists

**Question:**
You are given the heads of two sorted singly linked lists, `list1` and `list2`. Merge the two lists into one sorted list.

**Operations:**
- **Merge**: The task is to combine the two linked lists while maintaining the sorted order.
- **Linked List Traversal**: We traverse through both lists simultaneously, comparing the current nodes of both lists and appending the smaller node to the result list.
- **Result**: Once one of the lists is exhausted, the remaining part of the other list is appended to the result list.

**Solution Explanation:**
- We initialize a dummy node to help in building the merged list.
- Two pointers traverse through `list1` and `list2`. At each step, the smaller node between the two is added to the new list.
- If either list reaches the end before the other, we append the rest of the non-empty list to the result.
- This ensures that the final list is sorted.
  