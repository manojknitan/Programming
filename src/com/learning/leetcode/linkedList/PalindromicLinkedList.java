package com.learning.leetcode.linkedList;

public class PalindromicLinkedList {
    static class Node
    {
        int data;
        Node next;
        Node(int value)
        {
            this.data = value;
            this.next = null;
        }
    }

    public static void printList(Node head)
    {
        Node curr = head;
        while(curr != null)
        {
            System.out.print(curr.data+"->");
            curr = curr.next;
        }
        System.out.print("null");
    }

    public static boolean isPalindromic(Node head)
    {
        Node slow = head, fast = head;
        while(fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        if(fast != null)
        {
            slow = slow.next;
        }
        Node secondHalf = reverse(slow);
        Node firstHalf = head;

        while(secondHalf != null)
        {
            if(firstHalf.data != secondHalf.data)
                return false;
            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }
        return true;
    }

    public static Node reverse(Node head)
    {
        Node prev = null;
        Node curr = head;
        while (curr != null)
        {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
    public static void main(String[] args) {
        Node head = null;
        Node node1 = new Node(2);
        Node node2 = new Node(3);
        Node node3 = new Node(7);
        Node node4 = new Node(3);
        Node node5 = new Node(2);
        head = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        printList(head);
        System.out.println();
        System.out.println(isPalindromic(head));
    }
}
