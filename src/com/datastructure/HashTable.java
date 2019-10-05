package com.datastructure;

public class HashTable {
	public static void main(String[] args) {

	}
	
	
}

class Emp{
	public int id;
	public String name;
	Emp next;
	

	public Emp(int id, String name, Emp next) {
		super();
		this.id = id;
		this.name = name;
		this.next = next;
	}
	
}


class EmpLinkedList{
	private Emp head;
	
	public void add(Emp emp) {
		if(head == null) {
			head = emp;
			return;
		}
	}
}
