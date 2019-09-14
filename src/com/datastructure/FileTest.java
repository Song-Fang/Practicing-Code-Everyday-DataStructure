package com.datastructure;

import java.io.File;
import java.io.IOException;

public class FileTest {
	public static void main(String[] args) throws IOException {
		// test1();
		// test2();
		// test3();
		// test4();
		// test5();
		// createNewFile();
		// deleteFile("d:\\FileTest\\readMe.txt");
		// existsFile("d:\\FileTest\\io","txt");
		// listFile("d:\\FileTest");
		// listFileOneLayer("d:\\io");
		// System.out.println(fileSize("d:\\FileTest"));
		deleteDirectory("d:\\FileTest\\file");
	}

	public static void test1() {
		File file = new File("d:\\study\\readMe.txt");
		System.out.println(file.exists());
		System.out.println(file.getAbsolutePath());
		System.out.println(file.getName());
		System.out.println(file.getParent());
		System.out.println(file.isDirectory());
		System.out.println(file.isFile());
		System.out.println(file.isHidden());
		System.out.println(file.length());
	}

	public static void test2() throws IOException {
		File file = new File("d:\\study\\readMe.txt");
		if (file.exists()) {
			file.delete();
			System.out.println("Document has been Deleted!");
		} else {
			file.createNewFile();
			System.out.println("Document has been created!");
		}

	}

	public static void test3() {
		File file = new File("d:\\io\\readMe");
		if (file.mkdirs()) {
			System.out.println("Directory has been created!");
		} else {
			file.delete();
			System.out.println("Detectory has been deleted!");
		}
		;
	}

	public static void test4() throws IOException {
		File file = new File("readMe.txt");
		if (!file.exists()) {
			file.createNewFile();
		}
		File file2 = new File("d:\\study\\helloWorld.txt");
		if (file.renameTo(file2)) {
			System.out.println("Success!");
		}
		;

		File file3 = new File("d:\\io");
		file3.delete();
	}

	public static void test5() {
		File file = new File("d:\\study");
//		String [] fileList = file.list();
//		
//		for(String ele:fileList) {
//			System.out.println(ele);
//		}

		File[] fileList = file.listFiles();
		for (File ele : fileList) {
			System.out.println(ele);
		}
	}

	public static void createNewFile() throws IOException {
		File file = new File("d:\\FileTest");
		file.mkdir();

		File file2 = new File("d:\\FileTest\\io");
		file2.mkdir();

		File file3 = new File("d:\\FileTest\\io\\readMe.txt");
		file3.createNewFile();

		File file4 = new File("d:\\FileTest\\readMe.txt");
		file4.createNewFile();

	}

	public static void deleteFile(String fileName) {
		File file = new File(fileName);
		if (file.delete()) {
			System.out.println("Document has been deleted!");
		} else {
			System.out.println("Document can't be found!");
		}
	}

	public static void existsFile(String name, String type) {
		File file = new File(name);
		String[] fileArray = file.list();
		int flag = 0;
		for (String element : fileArray) {

			if (element.endsWith(type)) {
				System.out.println(element);
				flag = 1;

			}
		}
		if (flag == 0) {
			System.out.println("The type of file can't be found in this directory!");
		}
	}

	public static void listFile(String name) {
		File file = new File(name);
		File[] fileList = file.listFiles();
		for (File ele : fileList) {
			if (ele.isDirectory()) {
				System.out.println(ele.getName());
				listFile(ele.getAbsolutePath());
			} else {
				String fileName = ele.getName();
				System.out.println(fileName);
			}
		}
	}

	public static long fileSize(String name) {
		File file = new File(name);
		File[] fileList = file.listFiles();
		long size = 0;
		for (File ele : fileList) {
			if (!ele.isDirectory()) {
				size = size + ele.length();
			} else {
				size = size + fileSize(ele.getAbsolutePath());
			}
		}
		return size;
	}

	public static void deleteDirectory(String name) {
		File file = new File(name);
		if (!file.delete()) {
			File[] fileList = file.listFiles();
			for (File ele : fileList) {
				if (!ele.delete()) {
					deleteDirectory(ele.getAbsolutePath());
				}
			}
		}
		file.delete();
	}

	public static void listFileOneLayer(String pathName) {
		File file = new File(pathName);
		String[] fileList = file.list();
		for (String entry : fileList) {
			System.out.println(entry);
		}
	}

}
