package com.ds.practice.linkedlist;

import static org.junit.Assert.*;

import org.junit.Test;

public class LinkedListTest {
	
	@Test
	public void isEmptyTest() {
		LinkedList list = new LinkedList();
		assertTrue(list.isEmpty());
		list.addAtBeg(1);
		list.addAtEnd(2);
		assertFalse(list.isEmpty());
	}
	
	@Test
	public void addAtBegTest() {
		LinkedList list = new LinkedList();
		assertTrue(list.isEmpty());
		list.addAtBeg(4);
		list.addAtBeg(3);
		list.addAtBeg(2);
		list.addAtBeg(1);
		list.addAtBeg(0);		
		assertFalse(list.isEmpty());
		list.printList();
	}
	
	@Test
	public void addAtEndTest() {
		LinkedList list = new LinkedList();
		assertTrue(list.isEmpty());
		list.addAtEnd(4);
		list.addAtEnd(3);
		list.addAtEnd(2);
		list.addAtEnd(1);
		list.addAtEnd(0);		
		assertFalse(list.isEmpty());
		list.printList();
	}
	
	@Test
	public void sizeTest() {
		LinkedList list = new LinkedList();
		assertTrue(list.isEmpty());
		assertEquals(0, list.size());
		list.addAtEnd(4);
		list.addAtEnd(3);
		list.addAtEnd(2);
		list.addAtEnd(1);
		list.addAtEnd(0);		
		assertFalse(list.isEmpty());
		assertEquals(5, list.size());
	}
	
	@Test
	public void printReverseRecTest() {
		LinkedList list = new LinkedList();
		assertTrue(list.isEmpty());
		assertEquals(0, list.size());
		list.addAtEnd(4);
		list.addAtEnd(3);
		list.addAtEnd(2);
		list.addAtEnd(1);
		list.addAtEnd(0);		
		assertFalse(list.isEmpty());
		assertEquals(5, list.size());
		list.printReverseRec(list.head);
	}
}
