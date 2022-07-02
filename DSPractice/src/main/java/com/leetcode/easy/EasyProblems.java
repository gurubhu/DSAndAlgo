package com.leetcode.easy;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class EasyProblems {
	
	public static int romanToInt(String s) {
		Map<Character, Integer> romanMap = new HashMap<Character, Integer>();
		romanMap.put('I', 1);
		romanMap.put('V', 5);
		romanMap.put('X', 10);
		romanMap.put('L', 50);
		romanMap.put('C', 100);
		romanMap.put('D', 500);
		romanMap.put('M', 1000);
		
		int n = s.length();
		
		int sum = romanMap.get(s.charAt(n - 1));
		
		for(int i = n - 2; i >=0; i--) {
			if(romanMap.get(s.charAt(i)) >= romanMap.get(s.charAt(i + 1))) {
				sum +=  romanMap.get(s.charAt(i));
			}
			else {
				sum -=  romanMap.get(s.charAt(i));
			}
		}
		
		return sum;
	}
	
	
	//Time complexity : O(n^2)
	// Write this method for O(n) complexity
	public static int[] twoSum(int[] nums, int target) {
		int n = nums.length;
		int[] result = new int[2];
		
		for(int i = 0 ; i < n-1 ; i++) {
			for(int j = i + 1; j < n; j++) {
				if(nums[i] + nums[j] == target) {
					result[0] = i;
					result[1] = j;
					return result;
				}
			}
		}
		return result;
	}
	
	public static int removeDuplicates(int[] nums) {
		int n = nums.length;
		
		Set<Integer> numsSet = new LinkedHashSet<Integer>();
		
		for(int i = 0; i < n; i++) {
			if(!numsSet.contains(nums[i])) {
				numsSet.add(nums[i]);
			}
		}
		int i = 0;
		for(Integer num : numsSet) {			
			nums[i++] = num;
		}
		
		return numsSet.size();
	}
}
