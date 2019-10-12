package com.datastructure;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.junit.Test;

public class IteratatorHashMap {

	@Test
	public void testHashMap() {
		HashMap<String, Integer> map = new HashMap<String,Integer>();
		map.put("AA", 5);
		map.put("BB", 7);
		
		Set<String> keySet = map.keySet();
		Iterator<String> i = keySet.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		Collection<Integer> values = map.values();
		for(Object obj:values) {
			System.out.println(obj);
		}
		
		Iterator<Integer> iterator = values.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		Set<Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Entry<String, Integer>> iterator2 = entrySet.iterator();
		while(iterator2.hasNext()) {
			Map.Entry<String, Integer> entry = (Map.Entry<String, Integer>)iterator2.next();
			System.out.println(entry.getKey()+"----->"+entry.getValue());
		}
		
	}
}


