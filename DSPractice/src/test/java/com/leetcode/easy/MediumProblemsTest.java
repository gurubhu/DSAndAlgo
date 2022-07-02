package com.leetcode.easy;

import org.junit.Test;

public class MediumProblemsTest {
	
	@Test
	public void maxAreaTest() {
		//int[] height = {1,8,6,2,5,4,8,3,7};
		int[] height1 = {4,3,2,1,4};
		//MediumProblems.maxArea(height);
		MediumProblems.maxArea(height1);
	}
	
	@Test
	public void tripleSumTest() {
		int[] nums = {-1,0,1,2,-1,-4};
		MediumProblems.tripletSum(nums);
	}

}
