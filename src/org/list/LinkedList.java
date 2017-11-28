package org.list;

class Node {
    public int value;
    public Node next;

}


public class LinkedList {

    private Node head = null;

//   LinkedList list;
//
//    public LinkedList() {
//        this.list = new LinkedList();
//    }

//    LinkedList list = new LinkedList();

    private int count = 0;
    private int first = 0;


    public int size() {
        return count;
    }

    public int insert(int value) {
        Node newNode = new Node();
        newNode.value = value;
        newNode.next = head;
        head = newNode;
        return count++;
    }

    public int head() {
        return head.value;
    }
}
