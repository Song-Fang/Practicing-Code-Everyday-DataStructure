package com.datastructure;

import java.util.Arrays;

import org.junit.Test;

public class TestString {
	@Test
	public void testString() {
		String s1 = "abc";
		String s2 = "abc";
		String s3 = "efg";
		String s4 = "abc"+"efg";
		String s5 = s1 + "efg";
		String s6 = s5.intern();
		String s7 = "abcefg";
		String s8 = s1.concat("efg");
		System.out.println(s1==s2);
		System.out.println(s7==s4);
		System.out.println(s7==s5);
		System.out.println(s7==s6);
		System.out.println(s7==s8);
		String s9 = "HelloWorld!";
		String s10 = s9.replace('l', 'S');
		System.out.println(s10);
		
		char [] ch = s9.toCharArray();
		for(char newCh:ch) {
			System.out.print(newCh);
		}
		System.out.println(Arrays.toString(ch));
		
		
		String s11 = new String(ch);
		System.out.println(s11);
		
		byte [] bytes = s11.getBytes();
		System.out.println(Arrays.toString(bytes));
		
		final String s12 = "Hello";
		
		StringBuffer sb = new StringBuffer();
		long time = System.currentTimeMillis();
		System.out.println(time);
		
		
		
		
		
	}


}
