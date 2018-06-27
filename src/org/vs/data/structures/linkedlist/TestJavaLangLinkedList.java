package org.vs.data.structures.linkedlist;

import java.util.LinkedList;

public class TestJavaLangLinkedList {

    public static void main(String[] args) {
        java.util.LinkedList<String> list = new LinkedList<>();
        list.add("1");
        list.add("2");
        list.add(1, "3");
        list.addFirst("5");
        list.addLast("6");
        list.push("7");
        list.pop();
        list.remove(); //same as pop
        list.remove(2);

        System.out.println(list);
    }
}
