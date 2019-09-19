package com.datastructure;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class EncryptImage {
	
	
	public static void main(String [] args) throws IOException {
		FileInputStream fis = new FileInputStream("d:\\io\\Test.jpg");
		FileOutputStream fos = new FileOutputStream("d:\\io\\TestEncrypt.jpg");
		
		byte [] data = new byte[500];
		int len;
		while((len = fis.read(data))!=-1) {
			for(int i = 0;i<len;i++) {
				data[i] = (byte) (data[i]^5);
			}
			fos.write(data);
		}
		
		fis.close();
		fos.close();
		
	}
}
