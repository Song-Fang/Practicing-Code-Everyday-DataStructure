package com.datastructure;

import java.util.Scanner;

public class TestScanner {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.next();
		System.out.println(input);

		int newInput = scanner.nextInt();
		System.out.println(newInput);
		scanner.close();

	}
}
