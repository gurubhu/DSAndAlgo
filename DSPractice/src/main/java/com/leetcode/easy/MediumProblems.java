package com.leetcode.easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MediumProblems {
	
	public static int maxArea(int[] height) {
        int length = height.length;
        int secondMax = -1;
        int max = -1;
        int secondMaxIndex = -1;
        int maxIndex = -1;
//        if(length >= 2){
//            secondMax = height[0];
//            secondMaxIndex = 0;
//            max = height[1];
//            maxIndex = 1;
//        }
        for(int i = 0; i < length; i++){
            if(height[i] > max){
                secondMax = max;
                secondMaxIndex = maxIndex;
                maxIndex = i;
                max = height[i];
            }
            else if((height[i] > secondMax) && (height[i] < max)){
                secondMaxIndex = i;
                secondMax = height[i];
            }
        }
        
        return secondMax * Math.abs(maxIndex - secondMaxIndex);
    }
	
	public static int[][] tripletSum(int[] nums){
		int length = nums.length;
		Set<List<Integer>> set = new HashSet<List<Integer>>();
		
		
		for(int i = 0 ; i < length; i++) {
			for(int j= i+ 1; j < length; j++) {
				for(int k = j + 1; k < length; k++) {
					if(nums[i] + nums[j] + nums[k] == 0) {
						set.add(Arrays.asList(nums[i], nums[j], nums[k]));
					}
				}
			}
		}
		int[][] results = new int[set.size()][3];
		int j = 0;
		for(List<Integer> result : set) {
			int k = 0;
			for(Integer i : result) {
				results[j][k++]= i; 
			}
			j++;
		}
		
		return results;
	}
}
