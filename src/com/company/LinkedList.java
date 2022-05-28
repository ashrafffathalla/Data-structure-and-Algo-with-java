package com.company;

public class LinkedList {
    Node head;
    public  LinkedList(Node head)
    {
        this.head=head;
    }
    ///Method add element in linked list
    public void  add(Node newNode){
        newNode.next=head;
        head=newNode;
    }
}
