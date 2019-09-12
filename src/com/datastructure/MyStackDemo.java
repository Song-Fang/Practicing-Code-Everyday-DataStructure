package com.datastructure;

import java.util.Scanner;

public class MyStackDemo {
	public static void main(String[] args) {
		MyStack myStack = new MyStack(5);
		boolean loop = true;
		Scanner scanner = new Scanner(System.in);
		while (loop) {
			System.out.println("show: Show the element of Stack");
			System.out.println("push: Add new element");
			System.out.println("pop: Get dada from the stack");
			System.out.println("exit: Exit our program");
			String key = scanner.next();
			switch (key) {
			case "show":
				myStack.show();
				break;
			case "push":
				System.out.println("Please enter a number:");
				int value = scanner.nextInt();
				myStack.push(value);
				break;
			case "pop":
				try {
				System.out.printf("The number has been popped is %d", myStack.pop());
				}catch(Exception e){
					System.out.println(e.getLocalizedMessage());
				}
				break;
			case "exit":
				scanner.close();
				loop = false;
				break;
			default:
				break;
			}
			System.out.println("-------------------------");
		}
		System.out.println("Program has been shut down!");
	}
}

class MyStack {
	int top;
	int maxSize;
	int[] array;

	public MyStack(int maxSize) {
		top = -1;
		this.maxSize = maxSize;
		array = new int[maxSize];
	}

	public boolean isFull() {
		return top == maxSize - 1;
	}

	public boolean isEmpty() {
		return top == -1;
	}

	public void push(int num) {
		if (isFull()) {
			System.out.println("Stack is full!");
			return;
		}
		top++;
		array[top] = num;
	}

	public int pop() throws Exception {
		if (isEmpty()) {
			throw new Exception("Stack is empty!");
		}
		int result = array[top];
		top--;
		return result;
	}

	public void show() {
		if (isEmpty()) {
			System.out.println("Stack is Empty!");
			return;
		}
		for (int i = top; i >=0; i--) {
			System.out.printf("stack[%d]:%d\n", i, array[i]);
		}
	}
}
