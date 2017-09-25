package org.vs.data.structures.list.linkedlist;

public class LinkedList {

    Node head;

    public LinkedList() {
        head = null;
    }

    public void add(String data) {
        Node newNode = new Node(data);
        newNode.setNextNode(this.head);
        this.head = newNode;
    }

    public int length() {
        Node current = head;
        int length = 0;

        while (current != null) {
            length++;
            current = current.getNextNode();
        }

        return length;
    }

    public int indexOf(String data) {
        Node current = head;
        int index = 0;

        while (current != null) {
            if (current.getData().equals(data)) {
                return index;
            }
            index++;
            current = current.getNextNode();
        }

        return -1;
    }

    public String get(int index) {
        Node current = head;
        int count = 0;

        while (current != null) {
            if (count == index) {
                return current.getData();
            }
            count++;
            current = current.getNextNode();
        }

        throw new ArrayIndexOutOfBoundsException();
    }

    @Override
    public String toString() {
        String result = "[";
        Node current = head;

        while (current != null) {
            result += current.getData() + getSeparator(current);
            current = current.getNextNode();
        }
        return result + "]";
    }

    private String getSeparator(Node current) {
        return current.getNextNode() != null ? ", " : "";
    }

}
