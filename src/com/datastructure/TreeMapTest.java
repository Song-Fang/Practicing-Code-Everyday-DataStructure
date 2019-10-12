package com.datastructure;

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
}
