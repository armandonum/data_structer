## name 
Armando Nuñez Condori
# data structure
## linked list
### Description:
A linked list is a linear data structure, in which the elements are not stored at contiguous memory locations. The elements in a linked list are linked using pointers


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
   ```
![Frame 3.png](..%2F..%2F..%2F..%2F..%2Fdescargas%2FFrame%203.png)

# 2.bubble sort
### Description
Bubble sort is a simple sorting algorithm that repeatedly steps through the list, compares adjacent elements and swaps them if they are in the wrong order. The pass through the

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
