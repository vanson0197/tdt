package com.company;

public class LinkedList {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    // append items
    public void append( int a) {
        Node newNode = new Node(a);
        newNode.next = null;
        if (head == null) {
            head = newNode;
            newNode.next = null;

        } else {
            Node last = head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = newNode;
        }

    }

    // Delete first
    public void deleteFirst(){
        if(head == null){
            System.out.print("List is empty");
        }else{
            Node last = head.next;
            head = last;
        }

    }

    // search node with data
    public boolean searchNode( int data) {
        Node last = head;
        while (last != null) {
            if (last.data == data) {
                return true;
            } else
                last = last.next;
        }

        return false;

    }

    // print list
    public void printLinklist() {
        System.out.println("Print list:");
        Node last = head;
        while (last != null) {
            System.out.print(last.data + " ");
            last = last.next;
        }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.append(5);
        list.append(10);
        list.append(15);
        list.append(20);
        list.append(25);
        list.append(30);
        list.printLinklist();

        System.out.println();
        list.deleteFirst();
        list.printLinklist();

        System.out.print(list.searchNode(20));

    }


}
