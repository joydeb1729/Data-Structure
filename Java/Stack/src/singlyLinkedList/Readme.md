# Singly Linked List Implementation

This project implements a **Singly Linked List** in Java. A singly linked list is a linear data structure where each node contains a value and a reference to the next node in the sequence. This implementation supports essential operations like adding, removing, and traversing nodes.

## Class Overview

### 1. `SinglyLinkedList`
This class represents the singly linked list and provides methods to manipulate and interact with the list.

#### Attributes:
- **`head`**: The first node in the list.
- **`tail`**: The last node in the list.
- **`size`**: An integer representing the number of nodes in the list.

#### Methods:
- **`SinglyLinkedList()`**: Constructor to initialize an empty singly linked list.

- **`getSize()`**: Returns the current size (number of nodes) in the list.

- **`getHead()`**: Returns the head (first node) of the list.

- **`getTail()`**: Returns the tail (last node) of the list.

- **`isEmpty()`**: Checks if the list is empty. Returns `true` if empty, otherwise `false`.

- **`first()`**: Returns the element of the first node in the list. If the list is empty, it returns `-1`.

- **`last()`**: Returns the element of the last node in the list. If the list is empty, it returns `-1`.

- **`addFirst(int element)`**: Adds a new element to the front of the list.

- **`addLast(int element)`**: Adds a new element to the end of the list.

- **`removeFirst()`**: Removes the first node from the list and returns its element. If the list is empty, it returns `-1`.

- **`removeLast()`**: Removes the last node from the list and returns its element. If the list is empty, it returns `-1`.

- **`showList()`**: Displays all the elements of the list from head to tail.

### 2. `Node`
This class represents a single node in the singly linked list.

#### Attributes:
- **`element`**: The value stored in the node.
- **`next`**: A reference to the next node in the list.

#### Methods:
- **`Node(int element, Node next)`**: Constructor to initialize a node with a given element and reference to the next node.

- **`getElement()`**: Returns the value of the node.

- **`getNext()`**: Returns the next node in the sequence.

- **`setElement(int element)`**: Updates the value of the node.

- **`setNext(Node next)`**: Updates the reference to the next node.

