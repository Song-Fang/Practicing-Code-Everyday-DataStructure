package com.datastructure;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadLine {
	public static void main(String[] args) throws IOException {
		File file = new File("d:\\io\\ReadMe.txt");
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		String text = null;
		while((text = br.readLine())!=null) {
			System.out.println(text);
		}
		
		System.out.println("Hello World!");
		
		br.close();
		fr.close();

	}
}
