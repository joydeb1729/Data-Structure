# Stack Implementations in Java

This project contains two distinct implementations of the stack data structure in Java:
1. **Array-Based Stack**
2. **Linked List-Based Stack**

## 1. Array-Based Stack

The array-based stack uses a fixed-size array to store elements. The size of the array is either set to a default capacity or can be customized during the creation of the stack. This implementation is suitable for cases where the maximum size of the stack is known beforehand.

### Features:
- Capacity (default: 100 elements).
- Supports standard stack operations like push, pop, and top.
- Throws an exception when trying to push an element into a full stack.
- Provides methods to check if the stack is empty and to retrieve the current size of the stack.
- Includes a method to display the contents of the stack.

## 2. Linked List-Based Stack

The linked list-based stack utilizes a singly linked list to store elements. This allows for dynamic resizing, making it more flexible than the array-based implementation. The linked list stack can grow or shrink as needed, which is useful when the size of the stack is not predetermined.

### Features:
- Dynamically resizable, with no fixed capacity.
- Implements all basic stack operations, such as push, pop, and top.
- Efficient for memory usage when compared to a fixed-size array.
- Provides methods to check if the stack is empty and to retrieve the current size.
- Includes a method to display the elements in the stack.

