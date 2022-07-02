package com.ds.string;

import java.util.HashMap;
import java.util.Map;

public class StringProblems {
	
	public static boolean hasUniqueCharacters(String s) {
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		
		for(int i = 0; i < s.length(); i++) {
			if(map.containsKey(s.charAt(i))) {
				return false;
			}
			else {
				map.put(s.charAt(i), 1);
			}
		}
		
		return true;
	}
	
	public static boolean isPermutationOfOther(String s1, String s2) {
		
		if(s1.length() != s2.length()) return false;
		
		Map<Character, Integer> map1 = new HashMap<Character, Integer>();
		Map<Character, Integer> map2 = new HashMap<Character, Integer>();
		
		map1 = populateMap(s1);
		map2 = populateMap(s2);
		
		for(int i = 0 ; i < s1.length(); i++) {
			if(map1.get(s1.charAt(i)) != map2.get(s1.charAt(i))) {
				return false;
			}
		}
		return true;
	}

	private static Map<Character, Integer> populateMap(String s) {
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for(int i = 0; i < s.length(); i++) {
			if(!map.containsKey(s.charAt(i))) {
				map.put(s.charAt(i), 1);
			}
			else {
				int count = map.get(s.charAt(i));
				map.put(s.charAt(i), ++count);
			}
		}
		return map;
	}
}
