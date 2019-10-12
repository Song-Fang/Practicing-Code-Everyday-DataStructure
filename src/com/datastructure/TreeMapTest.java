package com.datastructure;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

import org.junit.Test;

public class TreeMapTest {

	@Test
	public void treeMapTest() {
		TreeMap<String,Integer> treeMap = new TreeMap<String,Integer>();
		treeMap.put("Francis", 23);
		treeMap.put("Dogus", 25);
		treeMap.put("Lee", 27);
		treeMap.put("Lynn", 29);
		treeMap.put("Peter", 33);
		
		Set<Entry<String,Integer>> entrySet = treeMap.entrySet();
		Iterator<Entry<String, Integer>> iterator = entrySet.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
	
	@Test
	public void treeMapSorting() {
		User u1 = new User("Lynn",25);
		User u2 = new User("Peter",45);
		User u3 = new User("Lee",65);
		
		
		TreeMap<User, Integer> treeMap = new TreeMap<User,Integer>(
				new Comparator<Object>() {

					@Override
					public int compare(Object o1, Object o2) {
						if(o1 instanceof User && o2 instanceof User) {
							//Why do I have to write these two sentences?
							User u1 = (User)o1;
							User u2 = (User)o2;
							return Integer.compare(u1.getAge(),u2.getAge());
						}else {
							throw new RuntimeException("The type you entered is wrong!");
						}
					}
				});
		treeMap.put(u1, 98);
		treeMap.put(u2, 33);
		treeMap.put(u3, 100);
		
		Set<Entry<User,Integer>> entrySet = treeMap.entrySet();
		Iterator<Entry<User, Integer>> iterator = entrySet.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		
	}
}

class User{
	String name;
	int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + "]";
	}
	public void setAge(int age) {
		this.age = age;
	}
	public User(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
}
