package com.datastructure;

import java.util.Stack;

public class LinkedList {
	public static void main(String [] args) {
		ListNode l1 = new ListNode(1,"Egg","Lynn");
		ListNode l2 = new ListNode(2,"Fox","Francis");
		ListNode l3 = new ListNode(3,"Dog","Peter");
		ListNode l4 = new ListNode(4,"Elf","Tim");
		ListNode l5 = new ListNode(5,"Tree","Tommy");
		SinglyLinkedList list = new SinglyLinkedList();
		list.addNewNode(l1);
		list.addNewNode(l2);
		//list.showNode();
		list.addNode(l5);
		list.addNode(l4);
		list.addNode(l3);
		//list.showNode();
		ListNode l6 = new ListNode(5,"Apple","Mary");
		list.updateNode(l6);
		//list.showNode();
		list.deleteNode(5);
		list.showNode();
		System.out.println(list.countNode());
		//list.showNode();
		list.deleteNode(4);
		list.deleteNode(3);
		//list.deleteNode(2);
		//list.deleteNode(8);
		//list.showNode();
		list.showNode();
		System.out.println(list.countNode());
		System.out.println(list.findKReverse(4));
		list.addNode(l4);
		list.addNode(l5);
		list.addNode(l3);
		System.out.println("-------------");
		list.showNode();
		list.reverseLinkedList();
		System.out.println("-------------");
		list.showNode();
		System.out.println("-------------");
		list.reversePrint();
		
		
		
		
		
		
		
	}

}

class SinglyLinkedList {
	ListNode head = new ListNode(0,"","");
	
	public void addNewNode(ListNode node) {
		ListNode temp = head;
		while(true) {
			if(temp.next==null) {
				temp.next = node;
				return;
			}
			temp = temp.next;
		}
	}
	
	public void addNode(ListNode node) {
		ListNode temp = head;
		while(true) {
			if(temp.next==null) {
				temp.next = node;
				return;
			}
			
			if(node.id<temp.next.id) {
				node.next=temp.next;
				temp.next=node;
				return;
			}
			temp = temp.next;
		}
	}
	
	public int countNode() {
		int count = 0;
		ListNode temp = head;
		while(temp.next!=null) {
			temp = temp.next;
			count++;
		}
		return count;
	}
	
	public ListNode findKReverse(int k) {
		ListNode temp = head;
		if(temp.next==null) {
			return null;
		}
		
		int size = countNode();
		if(k>size||k<=0) {
			return null;
		}
		for(int i =0;i<size-k+1;i++) {
			temp = temp.next;
		}
		return temp;
		
	}
	
	public void reverseLinkedList() {
		ListNode temp = head;
		if(temp.next ==null||temp.next.next==null) {
			return;
		}
		ListNode reverseNode = new ListNode(0,"","");
		ListNode curt = temp.next;
		while(curt!=null) {
			ListNode next = curt.next;
			curt.next = reverseNode.next;
			reverseNode.next = curt;
			curt = next;
		}
		head.next = reverseNode.next;
	}
	
	
	
	public void updateNode(ListNode node) {
		ListNode temp = head;
		if(temp.next==null) {
			System.out.println("The LinkedList is empty!");
			return;
		}
		while(true) {
			if(temp.next==null) {
				System.out.println("The node can't be found!");
				break;
			}
			if(temp.next.id==node.id) {
				temp.next.nickName = node.nickName;
				temp.next.realName = node.realName;
				break;
			}
			temp = temp.next;
			
		}
	}
	
	public void deleteNode(int id) {
		ListNode temp = head;
		if(temp.next==null) {
			System.out.println("The LinkedList is empty!");
			return;
		}
		
		while(true) {
			if(temp.next==null) {
				System.out.println("The node can't be found!");
				break;
			}
			if(temp.next.id==id) {
				temp.next = temp.next.next;
				break;
			}
			temp = temp.next;
		}
	}
	
	public void reversePrint() {
		if(head.next==null) {
			return;
		}
		ListNode temp = head;
		Stack<ListNode> newStack = new Stack<ListNode>();
		while(temp.next!=null) {
			newStack.add(temp.next);
			temp = temp.next;
		}
		while(newStack.size()!=0) {
			System.out.println(newStack.pop());
		}
	}
	
	public void showNode() {
		ListNode temp = head;
		if(temp.next==null) {
			System.out.println("LinkedList is empty");
			return;
		}
		while(temp.next!=null) {
			System.out.println(temp.next);
			temp=temp.next;
		}
	}
}

class ListNode {
	int id;
	String nickName;
	String realName;
	ListNode next;
	
	public ListNode(int id, String nickName,String realName) {
		this.id = id;
		this.nickName = nickName;
		this.realName = realName;
	}
	
	@Override
	public String toString() {
		return "LinkedList [id=" + id + ", nickName=" + nickName + ", realName=" + realName + "]";
	}
}
