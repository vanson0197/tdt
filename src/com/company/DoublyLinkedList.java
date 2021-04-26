package com.company;

public class DoublyLinkedList {
    Node head;

    class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
        }
    }

    // append item
    public void append(int data) {
        Node newNode = new Node(data);
        newNode.next = null;
        Node last = head;
        if (last == null) {
            head = newNode;
        } else {
            while (last.next != null) {
                last = last.next;
            }
            last.next = newNode;
            newNode.prev = last;
        }
    }

    // insert item in first of list
    public void insertFront(int data) {
        Node newNode = new Node(data);
        Node last = head;
        head = newNode;
        newNode.next = last;
        if (last != null) {
            last.prev = newNode;
        }

    }

    // Search node
    public boolean searchNode(int data) {
        Node last = head;
        while (last != null) {
            if (last.data == data)
                return true;
            last = last.next;
        }
        return false;

    }

    // Delete node
    public void deleteNode(Node del) {
        if (del == head) {
            head = del.next;
        }
        if (del.next != null) {
            del.next.prev = del.prev;
        }
        if (del.prev != null) {
            del.prev.next = del.next;
        }

    }

    // Delete node with data
    public void deleteData(int data) {
        Node last = head;
        while (last != null) {
            if (last.data == data) {
                deleteNode(last);
            }
            last = last.next;
        }
    }

    // print list
    public void printLinklist() {
        System.out.print("Print list :");
        Node last = head;
        while (last != null) {
            System.out.print(last.data + " ");
            last = last.next;
        }
    }


    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.append(2);
        list.append(5);
        list.append(3);
        list.append(10);
        list.append(5);
        list.printLinklist();

        list.insertFront(10);
        list.insertFront(50);
        System.out.println();
        list.printLinklist();

        System.out.println();
        System.out.print("The result of search node 3 : " + list.searchNode(3));


        System.out.println();
        list.deleteData(10);
        list.printLinklist();
    }


}
