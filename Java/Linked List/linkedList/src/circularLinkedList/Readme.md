# Circular Linked List Implementation

This project implements a **Circular Linked List** in Java. A circular linked list is a variation of a linked list where the last node points back to the first node, forming a circular structure. This implementation includes various operations that can be performed on a circular linked list, such as adding, removing, and rotating elements.

## Class Overview

### 1. `CircularLinkedList`
This class represents the circular linked list data structure and includes several methods to manipulate the list.

#### Attributes:
- **`tail`**: The `Node` object representing the last node in the circular list.
- **`size`**: An integer tracking the number of elements in the list.

#### Methods:
- **`CircularLinkedList()`**: Constructor that initializes an empty circular linked list.
  
- **`getSize()`**: Returns the size of the circular linked list.
  
- **`isEmpty()`**: Checks if the list is empty. Returns `true` if empty, `false` otherwise.
  
- **`first()`**: Returns the element at the head (the node following the `tail`). If the list is empty, it returns `-1`.
  
- **`last()`**: Returns the element at the `tail` of the circular linked list. If the list is empty, it returns `-1`.
  
- **`rotate()`**: Rotates the list by moving the `tail` pointer to the next node, effectively rotating the list by one position.
  
- **`addFirst(int element)`**: Adds a new element to the front of the list (right after the `tail`).
  
- **`addLast(int element)`**: Adds a new element to the end of the list (at the `tail` position).
  
- **`removeFirst()`**: Removes the first node (the node after the `tail`) from the list and returns its element. If the list is empty, it returns `-1`.
  
- **`showList()`**: Displays all elements in the circular linked list.

### 2. `Node`
This class represents a single node in the circular linked list.

#### Attributes:
- **`element`**: The data stored in the node.
- **`next`**: A reference to the next node in the list.

#### Methods:
- **`Node(int element, Node next)`**: Constructor that initializes a node with an element and a reference to the next node.
  
- **`getElement()`**: Returns the element of the current node.
  
- **`getNext()`**: Returns the next node in the list.
  
- **`setElement(int element)`**: Sets the value of the element in the node.
  
- **`setNext(Node next)`**: Sets the reference to the next node in the list.

## Circular Linked List Features
- **Efficient rotations**: The `rotate()` method allows the list to rotate efficiently, moving the `tail` to the next node.
  
- **Constant-time insertions/removals**: The operations `addFirst()`, `addLast()`, and `removeFirst()` all operate in constant time, making this implementation efficient for real-time applications.
  
- **Dynamic size**: The list dynamically expands and contracts as elements are added or removed.
