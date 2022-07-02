package com.leetcode.easy;

import static org.junit.Assert.*;

import org.junit.Test;

public class EasyProblemsTest {
	
	@Test
	public void romanToIntTest() {
		assertEquals(2, EasyProblems.romanToInt("II"));
		assertEquals(12, EasyProblems.romanToInt("XII"));
		assertEquals(27, EasyProblems.romanToInt("XXVII"));
		assertEquals(3, EasyProblems.romanToInt("III"));
		assertEquals(58, EasyProblems.romanToInt("LVIII"));
		assertEquals(1994, EasyProblems.romanToInt("MCMXCIV"));
	}
	
	@Test
	public void twoSumsTest() {
		int[] nums= {2,7,11,15};
		int[] expectedArray = {0,1};
		int [] actualArray = EasyProblems.twoSum(nums, 9);
		assertArrayEquals(expectedArray, actualArray);
	}
	
	@Test
	public void twoSumsTest1() {
		int[] nums= {3,2,4};
		int[] expectedArray = {1, 2};
		int [] actualArray = EasyProblems.twoSum(nums, 6);
		assertArrayEquals(expectedArray, actualArray);
	}
	
	@Test
	public void twoSumsTest2() {
		int[] nums= {3,3};
		int[] expectedArray = {0,1};
		int [] actualArray = EasyProblems.twoSum(nums, 6);
		assertArrayEquals(expectedArray, actualArray);
	}
	
	@Test
	public void removeDuplicatesTest() {
		EasyProblems.removeDuplicates(new int[]{1,1,2});
	}
}
