package com.datastructure;

public class DoublyLinkedList {
	public static void main(String [] args) {
		DListNode d1 = new DListNode(1,"egg","Lynn");
		DListNode d2 = new DListNode(2,"fox","Francis");
		DListNode d3 = new DListNode(3,"Dog","Peter");
		DListNode d4 = new DListNode(4,"Elf","Tim");
		DListNode d5 = new DListNode(4,"Tree","Diana");
		
		DList list = new DList();
		list.addDlist(d1);
		list.addDlist(d2);
		list.addDlist(d3);
		list.addDlist(d4);
		list.showNode();
		System.out.println("--------------");
		list.upDateNode(d5);
		list.showNode();
		System.out.println("--------------");
		list.deleteNode(4);
		list.showNode();
		
	}
}


class DList{
	DListNode head = new DListNode(0,"","");
	
	public void addDlist(DListNode node) {
		DListNode temp = head;
		while(temp.next!=null) {
			temp = temp.next;
		}
		temp.next = node;
		node.prev = temp;
		
	}
	
	public void showNode() {
		DListNode temp = head;
		if(temp.next==null) {
			System.out.println("The list is empty!");
		}
		while(temp.next!=null) {
			System.out.println(temp.next);
			temp = temp.next;
		}
	}
	
	
	public void upDateNode(DListNode node) {
		DListNode temp = head;
		if(temp.next==null) {
			return;
		}
		
		while(temp.next!=null) {
			if(temp.next.id==node.id) {
				temp.next.nickName = node.nickName;
				temp.next.realName = node.realName;
				return;
			}
			temp = temp.next;
		}
		System.out.println("The node you need to change can't be found!");
	}
	
	public void deleteNode(int id) {
		DListNode curt = head.next;
		if(curt==null) {
			System.out.println("The list is empty! Can't delete!");
		}
		while(curt!=null) {
			if(curt.id==id) {
				curt.prev.next = curt.next;
				if(curt.next!=null) {
					curt.next.prev = curt.prev;
				}
				return;
			}
			curt = curt.next;
		}
	}
	
}


class DListNode {
	int id;
	String realName;
	String nickName;
	DListNode next;
	DListNode prev;
	
	public DListNode(int id, String realName,String nickName) {
		this.id = id;
		this.realName = realName;
		this.nickName = nickName;
		
	}

	@Override
	public String toString() {
		return "DListNode [id=" + id + ", realName=" + realName + ", nickName=" + nickName+"]";
	}
	
	
	
	
}
