package com.datastructure;

import java.util.Arrays;

import org.junit.Test;

public class TestString {
	@Test
	public void testString() {
//		String s1 = "abc";
//		String s2 = "abc";
//		String s3 = "efg";
//		String s4 = "abc"+"efg";
//		String s5 = s1 + "efg";
//		String s6 = s5.intern();
//		String s7 = "abcefg";
//		String s8 = s1.concat("efg");
//		final String s9 = "abc";
//		String s10 = s9 + "efg";
//		String s11 = s9 + s3;
//		
//		System.out.println(s1==s2);
//		System.out.println(s7==s4);
//		System.out.println(s7==s5);
//		System.out.println(s7==s6);
//		System.out.println(s7==s8);
//		System.out.println(s1==s9);
//		System.out.println(s7==s10);
//		System.out.println(s7==s11);
		
		String str1 = "aaa";
		String str2 = "bbb";
		String str3 = str1+str2;
		
		//str3.intern();
		String str4 = "aaabbb";
		
		System.out.println(str3==str4);
		
//		String s9 = "HelloWorld!";
//		String s10 = s9.replace('l', 'S');
//		System.out.println(s10);
//		
//		char [] ch = s9.toCharArray();
//		for(char newCh:ch) {
//			System.out.print(newCh);
//		}
//		System.out.println(Arrays.toString(ch));
//		
//		
//		String s11 = new String(ch);
//		System.out.println(s11);
//		
//		byte [] bytes = s11.getBytes();
//		System.out.println(Arrays.toString(bytes));
//		
//		final String s12 = "Hello";
//		
//		StringBuffer sb = new StringBuffer();
//		long time = System.currentTimeMillis();
//		System.out.println(time);
		
		
		int num200 = 2000;
		int num300 = 2000;
		System.out.println(num200==num300);
		Integer num400 = 40000;
		Integer num500 = 40000;
		System.out.println(num400==num500);
		Long h = 300L;
		Integer i = 100;
		Integer j = 200;
		System.out.println(h==(i+j));
		
		
		
		StringBuffer sb = new StringBuffer(10);
		//sb.delete(0, 2);
		sb.replace(0, 4, "PPP");
		System.out.println(sb);
		
		String s = "HelloWorld";
		s.replace("l", "p");
		System.out.println(s);
		
		String st = "abHelloWorld";
		byte[] b = st.getBytes();
		for(byte c :b) {
			System.out.println(c);
		}
		
		
		
		
		
		
		
		
		
		
	}


}
