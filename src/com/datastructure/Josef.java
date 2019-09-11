package com.datastructure;

public class Josef {
	public static void main(String[] args) {
		CircleLinkedList myList = new CircleLinkedList(8);
		myList.showNode();
		myList.printKNode(1, 2, 8);
	}
}

class CircleLinkedList {
	CListNode first;

	public CircleLinkedList(int num) {
		CListNode curt = null;
		for (int i = 1; i <= num; i++) {
			CListNode node = new CListNode(i);
			if (i == 1) {
				
				first = node;
				curt = node;
				first.next = first;
			} else {
				curt.next = node;
				node.next = first;
				curt = curt.next;
			}

		}
	}

	public void showNode() {
		CListNode curt = null;
		if (first == null) {
			System.out.println("The List is empty!");
		}

		while (curt != first) {
			if (curt == null) {
				curt = first;
			}
			System.out.println(curt);
			curt = curt.next;
		}
	}
	
	public void printKNode(int start, int k, int num) {
		if(first==null||start<1||start>num) {
			System.out.println("Wrong index!");
		}
		
		CListNode helper = first;
		while(helper.next!=first) {
			helper = helper.next;
		}
		
		for(int i =1;i<start;i++) {
			first = first.next;
			helper = helper.next;
		}
		
		while(helper!=first) {
			for(int i = 0;i<k-1;i++) {
				first = first.next;
				helper = helper.next;
			}
			System.out.println(first+"goes out!");
			helper.next = first.next;
			first = first.next;
		}
		System.out.println("Last element is "+first);
	}
}

class CListNode {
	int id;
	CListNode next;

	public CListNode(int id) {
		super();
		this.id = id;
	}

	@Override
	public String toString() {
		return "CListNode [id=" + id + "]";
	}

}
