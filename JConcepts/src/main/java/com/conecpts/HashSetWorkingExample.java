package com.conecpts;

import java.util.HashSet;
import java.util.Set;

import com.model.Person;

public class HashSetWorkingExample {

	public static void main(String[] args) {
		Set<Person> set = new HashSet<Person>();
		Person p1 = new Person(1, "Guru");
		Person p2 = new Person(1, "Guru");
		
		set.add(p1);
		set.add(p2);
		
		System.out.println(set.size());
	}

}
