package com.datastructure;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyImage {
	public static void main(String[] args) throws IOException {
		File rawData = new File("d:\\io\\test.jpg");
		File destData = new File("d:\\io\\testbp.jpg");
		FileInputStream fis = new FileInputStream(rawData);
		FileOutputStream fos = new FileOutputStream(destData);
		byte [] buffer = new byte[5];
		int len;
		while((len=fis.read(buffer))!=-1) {
			fos.write(buffer);
		}
		
		fis.close();
		fos.close();
	}
}
