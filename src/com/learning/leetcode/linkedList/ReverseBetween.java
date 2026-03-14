package com.learning.leetcode.linkedList;

public class ReverseBetween {
    static class Node{
        int data;
        Node next;
        Node(int value)
        {
            this.data = value;
            this.next = null;
        }
    }

    public static Node revBetween(Node head, int left, int right)
    {
        if(head == null || left == right)
            return head;

        Node dummy = new Node(0);
        dummy.next = head;

        Node prev = dummy;
        for(int i=0; i<left-1; i++)
        {
            prev = prev.next;
        }

        Node curr = prev.next;
        for(int i=0; i<right-left; i++) {
            Node next = curr.next;
            curr.next = next.next;
            next.next = prev.next;
            prev.next = next;
        }
        return dummy.next;
    }
    public static void printList(Node head)
    {
        Node curr = head;
        while(curr != null)
        {
            System.out.print(curr.data+"->");
            curr = curr.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        Node head = null;
        Node node1 = new Node(10);
        Node node2 = new Node(20);
        Node node3 = new Node(30);
        Node node4 = new Node(40);
        Node node5 = new Node(50);

        //linking
        head = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        //printing
        printList(head);
        head = revBetween(head, 2,4);
        printList(head);
    }
}
