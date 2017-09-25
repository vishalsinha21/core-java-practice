package org.vs.data.structures.list.linkedlist;

public class TestLinkedList {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");

        System.out.println(list);
        System.out.println("length: " + list.length());
        System.out.println("index of one: " + list.indexOf("one"));
        System.out.println(list.get(3));
    }

}
