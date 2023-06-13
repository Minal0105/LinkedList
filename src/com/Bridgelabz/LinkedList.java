package com.Bridgelabz;

public class LinkedList<T> {
    public Node head;
    int count = 0;
    public  void add(T num) {
        Node newNode = new Node(num);
        if (head == null) {
            head = newNode;
            count++;
            return;
        }
        Node temp = head;
        while (temp.next != null)
        {
            temp = temp.next;
        }
        temp.next = newNode;
        count++;
    }

    @Override
    public String toString() {
        return "LinkedList{" +
                "head=" + head +
                ", count=" + count +
                '}';
    }
}
