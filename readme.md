## name 
Armando Nuñez Condori

# Task
1. tower of hanoi
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

2.bubble sort