package com.datastructure;

public class ArrBinaryTreeTest {
	public static void main(String[] args) {
		
		int [] arr = {1,2,3,4,5,6,7};
		ArrBinaryTree abt = new ArrBinaryTree(arr);
		//abt.preOrder(0);
		//abt.inOrder(0);
		abt.postOrder(0);
	}
}

class ArrBinaryTree {
	private int[] arr;

	public ArrBinaryTree(int[] arr) {
		this.arr = arr;
	}

	public void preOrder(int i) {
		if (arr == null || arr.length == 0) {
			System.out.println("No elements");
			return;
		}

		System.out.println(arr[i]);
		if (2 * i + 1 < arr.length) {
			preOrder(2 * i + 1);
		}

		if (2 * i + 2 < arr.length) {
			preOrder(2 * i + 2);
		}
	}
	
	public void inOrder(int i) {
		if(arr==null||arr.length==0) {
			System.out.println("No elements");
			return;
		}
		
		if(2*i+1<arr.length) {
			inOrder(2*i+1);
		}
		
		System.out.println(arr[i]);
		
		if(2*i+2<arr.length) {
			inOrder(2*i+2);
		}
		
	}
	
	public void postOrder(int i) {
		if(arr==null||arr.length==0) {
			System.out.println("No elements");
			return;
		}
		
		if(2*i+1<arr.length) {
			postOrder(2*i+1);
		}
		
		if(2*i+2<arr.length) {
			postOrder(2*i+2);
		}
		
		System.out.println(arr[i]);
	}
}
