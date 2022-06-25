package com.ds.recursion;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RecursionBasicsTest {
	
	@Test
	public void fibTest() {
		
		assertEquals(0, RecursionBasics.fib(0));
		assertEquals(1, RecursionBasics.fib(1));
		assertEquals(1, RecursionBasics.fib(2));
		assertEquals(2, RecursionBasics.fib(3));
		assertEquals(3, RecursionBasics.fib(4));
		assertEquals(5, RecursionBasics.fib(5));
		assertEquals(8, RecursionBasics.fib(6));
		assertEquals(13, RecursionBasics.fib(7));
		assertEquals(21, RecursionBasics.fib(8));
	}

}
