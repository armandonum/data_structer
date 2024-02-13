## name 
Armando Nuñez Condori
# data structure
## linked list
### Description:
A linked list is a linear data structure, in which the elements are not stored at contiguous memory locations. The elements in a linked list are linked using pointers
### Methods:
```java
public interface ILinkedList<T> {
    int size();
    boolean isEmpty();
    Node<T> first();
    Node<T> last();
    void addFirst(T data);
    void addLast(T data);
    void removeFirst();
    void removeLast();
}
```
### example of use:
in the main class, we can use the methods of the linked list interface
```java
                    list.addFirst(54);
                    list.addLast(2);
                    list.addFirst(12);
                    list.addLast(8);
                    
                    list.removeFirst(); // remove the first element
                    
                    list.removeLast(); // remove the last element
```

# stacks
### Description:
A stack is a linear data structure that serves as a collection of elements, with two main principal operations: push, which adds an element to the collection, and pop, which removes the most recently added element that was not yet removed.
### Methods:
```java
    int size();

    // return the number of elements in the stack
    boolean isEmpty();

    // return true if the stack is empty
    void push(E e);
    // add element e to the top of the stack

    E top();

    // return the top element of the stack, without removing it
    E pop();
    // remove and return the top element from the stack
```
### example of use:
in the main class, we can use the methods of the stack interface
```java
                    stack.push(54);
                    stack.push(2);
                    stack.push(12);
                    stack.push(8);
                    
                    stack.pop(); // remove the top element
                    stack.top(); // return the top element
```

# queue
### Description:
A queue is a linear data structure that serves as a collection of elements, with two main principal operations: enqueue, which adds an element to the collection, and dequeue, which removes the oldest element that was added.
### Methods:
```java
    int size();

    // return the number of elements in the queue
    boolean isEmpty();

    // return true if the queue is empty
    void enqueue(E e);
    // add element e to the back of the queue

    E first();

    // return the first element of the queue, without removing it
    E dequeue();
    // remove and return the first element from the queue
```
### example of use:
in the main class, we can use the methods of the queue interface
```java
                    queue.enqueue(54);
                    queue.enqueue(2);
                    queue.enqueue(12);
                    queue.enqueue(8);
                    
                    queue.dequeue(); // remove the first element
                    queue.first(); // return the first element
```


# Binary trees
### Description:
A binary tree is a tree data structure in which each node has at most two children, which are referred to as the left child and the right child.
### Methods:
```java
 void insert(int data);

    boolean search(int data);

    BTNode getRoot();

    BTNode getNode(int data);

    void delete(int data);
    int size();

    int[] inOrder(BTNode node);
    int[] preOrder(BTNode node);

    int[] postOrder(BTNode node);
    int height();

```
### example of use:
in the main class, we can use the methods of the binary tree interface
```java
                    tree.insert(54);
                    tree.insert(2);
                    tree.insert(12);
                    tree.insert(8);
                    
                    tree.search(54); // return true if the element is in the tree
                    tree.delete(54); // remove the element from the tree
                    tree.inOrder(tree.getRoot()); // return the elements in order
```


# Task
# 1. tower of hanoi
### Description
The Tower of Hanoi is a mathematical game or puzzle. It consists of three rods and a number of disks of different sizes, which can slide onto any rod. The puzzle starts with the disks in a neat stack in ascending order of size on one rod, the smallest at the top, thus making a conical shape.
```java
public void resolve(int n, ITowerHanoi tower) {
        Stack<Integer> source = new Stack<>();
        Stack<Integer> aux = new Stack<>();
        Stack<Integer> destiny = new Stack<>();
        for (int i = n; i >=1; i--) {
            source.push(i);
        }
        tower.printStatus(source,aux,destiny);
        move(n,source,aux,destiny,tower);
        System.out.println("hanoi tower solved");
    }
public void move(int n, Stack<Integer> source, Stack<Integer> aux, Stack<Integer> destiny, ITowerHanoi tower) {
    if(n>0){
        move(n-1,source,destiny,aux,tower);
        tower.moveDisc(source,destiny);
        tower.printStatus(source,aux,destiny);
        move(n-1,aux,source,destiny,tower);

    }
}
   ```
![Frame 3.png](img%2FFrame%203.png)
# 2.bubble sort
### Description
Bubble sort is a simple sorting algorithm that repeatedly steps through the list, compares adjacent elements and swaps them if they are in the wrong order.

```java
   for (int i = 1; i < n; i++) {
            if (array[i] < array[i - 1]) {
                aux = array[i];
                array[i] = array[i - 1];
                array[i - 1] = aux;
            }
        }
 ``` 
![Frame 2 (1).png](img%2FFrame%202%20%281%29.png)

This method compares each element with the previous one, if that element is smaller than its predecessor, then it exchanges positions and compares with the next element, repeating that process depending on the size of the array
