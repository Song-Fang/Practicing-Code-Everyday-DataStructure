package com.datastructure;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.Test;

public class CollectionsTest {

	
	@Test
	public void collectionTest() {
		List<Integer> list = new ArrayList<Integer>();
		list.add(15);
		list.add(16);
		list.add(22);
		list.add(32);
		list.add(45);
		
		//Key point
		List<Object> dest = Arrays.asList(new Object[list.size()]);
		//List<Object> dest = new ArrayList<Object>();
		//dest.add(null);
		System.out.println(dest);
		Collections.copy(dest, list);
		System.out.println(dest);
		
	}
}
