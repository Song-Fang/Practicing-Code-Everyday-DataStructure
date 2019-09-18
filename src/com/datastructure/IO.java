package com.datastructure;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class IO {
	public static void main(String [] args) throws IOException {
		File file = new File("d:\\io\\test.txt");
		//FileWriter fw = new FileWriter(file,true);
		//fw.write("Hello World!\n");
		//fw.write("Today is a nice day！We should study!\n");
		//fw.close();
		
		FileReader fr = new FileReader(file);
		char [] array = new char[5];
		int len;
		while((len = fr.read(array))!=-1) {
			for(int i = 0;i<len;i++) {	
				System.out.print(array[i]);
			}
			System.out.println();
		}
		fr.close();
	}
}

