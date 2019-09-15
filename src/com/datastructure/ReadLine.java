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
		String no = br.readLine();
//		if(!no.equals("<DOC>")) {
//			return;
//		}
		while(!no.startsWith("<DOCNO>")) {
			no = br.readLine();
		}
		
		while(!br.readLine().startsWith("<TEXT>")) {
			continue;
		}
		String content = br.readLine();
		StringBuffer sb = new StringBuffer();
		while(!content.startsWith("</TEXT>")) {
			sb.append(content+" ");
			content = br.readLine();
		}
		while(!br.readLine().startsWith("</DOC>")) {
			continue;
		}
		System.out.println(sb);
		System.out.println(br.readLine());
		int start = no.indexOf(">");
		int end = no.indexOf("<",start);
		no = no.substring(start+1,end).trim();
		System.out.println(no);
		br.close();
		fr.close();
	}
}
