package org.vs.data.structures.linkedlist;

public class LinkedList {

    private Node head = null;

    public void addAtHead(String data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public boolean contains(String str) {
        Node current = head;
        while (current != null) {
            if (current.data.equals(str)) {
                return true;
            }
            current = current.next;
        }

        return false;
    }

    public String get(int index) {
        Node current = head;
        while (index > 0) {
            current = current.next;
            index--;
        }
        return current.data;
    }

    public boolean delete(String str) {
        if (head.data.equals(str)) {
            head = head.next;
            return true;
        }

        Node previous = head;
        Node current = head;

        while (current != null) {
            if (current.data.equals(str)) {
                previous.next = current.next;
                return true;
            }
            previous = current;
            current = current.next;
        }

        return false;
    }

    public int length() {
        int length = 0;
        Node current = head;
        while (current != null) {
            length++;
            current = current.next;
        }
        return length;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        Node current = head;
        while (current != null) {
            builder.append(current + " | ");
            current = current.next;
        }
        return builder.toString();
    }

}

class Node {
    String data;
    Node next;

    public Node(String data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return data;
    }
}