package org.example;

public class LinkedList {
    private Node head;
    private static class Node {
        int data; // Datos del nodo
        Node next; // Referencia al siguiente nodo

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Constructor de la lista enlazada
    public LinkedList() {
        this.head = null;
    }

    // Método para agregar un nuevo nodo al final de la lista
    public void append(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        Node current = head;
        while (current.next != null) {
            current = current.next;
        }

        current.next = newNode;
    }

    // Método para imprimir la lista enlazada
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    // Ejemplo de uso
    public static void main(String[] args) {
        LinkedList myList = new LinkedList();
        myList.append(1);
        myList.append(2);
        myList.append(3);

        System.out.print("Lista enlazada: ");
        myList.printList();
    }
}
