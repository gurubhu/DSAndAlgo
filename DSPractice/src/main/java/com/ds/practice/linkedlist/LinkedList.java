package com.ds.practice.linkedlist;

public class LinkedList {
	
	Node head;
	
	public LinkedList() {
		head = null;
	}
	
	public boolean isEmpty() {
		return head == null;
	}
	
	public void addAtBeg(int item) {
		
		Node node = new Node(item);
		node.next = head;
		head = node;
	}
	
	public void addAtEnd(int item) {
		
		Node node = new Node(item);
		
		if(head == null) {
			head = node;
			return;
		}
		
		Node temp = head;
		while(temp.next != null) {
			temp = temp.next;
		}
		
		temp.next = node;
	}
	
	public int size() {
		int size = 0;
		Node temp = head;
		while(temp != null) {
			size++;
			temp = temp.next;
		}
		return size;
	}
	
	public void printList() {
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.data + "-->");
			temp = temp.next;
		}
		System.out.println("NULL");
	}
	
	public void printReverseRec(Node head) {
		if(head == null)
			return;
		printReverseRec(head.next);
		System.out.print(head.data + " ");
	}
	
	public void deleteGivenItem(int item) {
		if(head == null)
			return;
		if(head.data == item) {
			head = head.next;
			return;
		}
		Node temp = head;
		while(temp != null && temp.data != item) {
			temp = temp.next;
		}
		if(temp != null) {
			temp = temp.next;
		}
	}
}
