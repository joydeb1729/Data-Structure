# Array Binary Tree

## Overview
The ArrayBinaryTree class implements a binary tree data structure using an array to store elements. This implementation allows for efficient access and management of nodes based on their indices in the array.

## Features
- Array-Based Structure: The tree is represented as an array, where for any node at index i, its left child is at index 2*i + 1 and its right child is at index 2*i + 2.
- Fixed Capacity: The tree has a defined maximum capacity, making it efficient for memory usage but limiting growth.
- Basic Operations:
  - Add root node
  - Add left and right children
  - Display the tree structure

## Usage
1. Creating a Tree: Create an instance of the ArrayBinaryTree class and add a root node.
2. Adding Children: Use methods to add left and right children to nodes.
3. Displaying the Tree: Use the show method to visualize the tree structure.

## Complexity
- Insertion: O(1) for adding direct children (assuming no out-of-bounds issues).
- Traversal: O(n) for visiting all nodes.

## License
This project is licensed under the MIT License.
