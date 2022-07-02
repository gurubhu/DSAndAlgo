package com.ds.string;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringProblemsTest {
	
	@Test
	public void hasUniqueCharactersTest() {
		String s1 = "abc";
		assertTrue(StringProblems.hasUniqueCharacters(s1));
		String s2 = "abca";
		assertFalse(StringProblems.hasUniqueCharacters(s2));
	}
	
	@Test
	public void isPermutationOfOther() {
		String s1 = "abc";
		String s2 = "cbd";
		assertFalse(StringProblems.isPermutationOfOther(s1, s2));
	}
}
