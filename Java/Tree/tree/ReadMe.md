# Linked Binary Tree

## Overview
The LinkedBinaryTree class implements a binary tree data structure using linked nodes. Each node contains a reference to its parent, left child, and right child, allowing for efficient insertion, deletion, and traversal operations.

## Features
- Node Structure: Each node contains an integer element, references to its parent, left child, and right child.
- Dynamic Size: The tree can grow and shrink dynamically as nodes are added or removed.
- Basic Operations:
  - Add root node
  - Add left and right children
  - Remove a node
  - Attach subtrees
  - Display the tree structure

## Usage
1. Creating a Tree: Create an instance of the LinkedBinaryTree class and add a root node.
2. Adding Children: Use methods to add left and right children to nodes.
3. Removing a Node: Call the remove method to delete a specific node.
4. Displaying the Tree: Use the show method to visualize the tree structure.

## Complexity
- Insertion/Deletion: O(1) for adding/removing direct children.
- Traversal: O(n) for visiting all nodes.

## License
This project is licensed under the MIT License.
