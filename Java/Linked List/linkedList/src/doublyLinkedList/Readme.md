# Doubly Linked List Implementation

This project implements a **Doubly Linked List** in Java. A doubly linked list is a data structure where each node has references to both the next and previous nodes, allowing for efficient bidirectional traversal. This implementation includes several basic operations for managing and manipulating the list.

## Class Overview

### 1. `DoublyLinkedList`
This class represents the doubly linked list and includes methods to perform operations such as adding, removing, and accessing nodes from both the front and the back of the list.

#### Attributes:
- **`header`**: A sentinel node representing the front of the list (without storing any element).
- **`tailer`**: A sentinel node representing the end of the list (without storing any element).
- **`size`**: An integer tracking the number of elements in the list.

#### Methods:
- **`DoublyLinkedList()`**: Constructor that initializes an empty doubly linked list with sentinel header and tailer nodes.

- **`getSize()`**: Returns the current size (number of elements) in the list.

- **`isEmpty()`**: Checks if the list is empty. Returns `true` if empty, otherwise `false`.

- **`first()`**: Returns the element of the first node in the list. If the list is empty, it returns `-1`.

- **`last()`**: Returns the element of the last node in the list. If the list is empty, it returns `-1`.

- **`addFirst(int element)`**: Adds a new element to the front of the list, immediately after the `header` node.

- **`addLast(int element)`**: Adds a new element to the end of the list, immediately before the `tailer` node.

- **`removeFirst()`**: Removes the first element (the node after `header`) and returns its value. Returns `-1` if the list is empty.

- **`removeLast()`**: Removes the last element (the node before `tailer`) and returns its value. Returns `-1` if the list is empty.

- **`addBetween(int element, Node successor, Node predecessor)`**: Adds a new node with the given element between two existing nodes.

- **`remove(Node node)`**: Removes a given node from the list and returns its element. The node is removed by adjusting the `next` and `prev` pointers of the adjacent nodes.

- **`showList()`**: Displays all elements of the list in order, from first to last.

### 2. `Node`
This class represents a single node in the doubly linked list.

#### Attributes:
- **`element`**: The value/data stored in the node.
- **`next`**: A reference to the next node in the list.
- **`prev`**: A reference to the previous node in the list.

#### Methods:
- **`Node(int element, Node next, Node prev)`**: Constructor to initialize a node with the given element, next, and previous node references.

- **`getElement()`**: Returns the element stored in the node.

- **`getNext()`**: Returns the reference to the next node.

- **`getPrev()`**: Returns the reference to the previous node.

- **`setElement(int element)`**: Sets the value of the node's element.

- **`setNext(Node next)`**: Updates the reference to the next node.

- **`setPrev(Node prev)`**: Updates the reference to the previous node.

## Doubly Linked List Features
- **Bidirectional Traversal**: Each node points to both the previous and the next nodes, allowing traversal in both directions.
  
- **Efficient Add/Remove Operations**: Inserting and deleting nodes can be done in constant time with references to the appropriate nodes.
  
- **Sentinel Nodes**: The `header` and `tailer` sentinel nodes make the implementation simpler by eliminating edge cases, such as inserting/removing nodes at the start or end of the list.


