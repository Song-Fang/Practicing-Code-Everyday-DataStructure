package com.datastructure;

public class HashMapImplement {

	public static void main(String[] args) {
		HashMapEmp hashMapEmp = new HashMapEmp();

		ListNodeEmp emp1 = new ListNodeEmp(14, "Lynn");
		ListNodeEmp emp2 = new ListNodeEmp(3, "Franci");
		ListNodeEmp emp3 = new ListNodeEmp(15, "Katy");
		ListNodeEmp emp4 = new ListNodeEmp(22, "Peter");
		ListNodeEmp emp5 = new ListNodeEmp(88, "Lewis");

		hashMapEmp.addEmp(emp1);
		hashMapEmp.addEmp(emp2);
		hashMapEmp.addEmp(emp3);
		hashMapEmp.addEmp(emp4);
		hashMapEmp.addEmp(emp5);

		hashMapEmp.showEmp();
	}
}

class HashMapEmp {
	LinkedListEmp[] linkedListEmp;

	public HashMapEmp() {
		super();
		// TODO Auto-generated constructor stub
		linkedListEmp = new LinkedListEmp[7];
	}

	public void addEmp(ListNodeEmp emp) {
		int i = emp.id % 7;
		linkedListEmp[i] = new LinkedListEmp();
		linkedListEmp[i].addNode(emp);
	}

	public void findEmp(int id) {
		int i = id % 7;
		linkedListEmp[i] = new LinkedListEmp();
		linkedListEmp[i].findNode(id);
	}

	public void deleteEmp(int id) {
		int i = id % 7;
		linkedListEmp[i] = new LinkedListEmp();
		linkedListEmp[i].deleteNode(id);
	}

	public void showEmp() {
		for (LinkedListEmp node : linkedListEmp) {
			if (node != null) {
				node.showNode();
			}
		}
	}
}

class LinkedListEmp {
	ListNodeEmp head;

	public LinkedListEmp(ListNodeEmp head) {
		super();
		this.head = head;
	}

	public LinkedListEmp() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void addNode(ListNodeEmp node) {
		if (head == null) {
			head = node;
			return;
		}
		ListNodeEmp curt = head;
		while (curt.next != null) {
			curt = curt.next;
		}
		curt.next = node;
	}

	public void deleteNode(int id) {
		if (head == null) {
			System.out.println("The Emp can't be found!");
			return;
		}

		ListNodeEmp temp = head;
		if (head.next == null && head.id == id) {
			head = null;
			return;
		}
		while (temp.next != null) {
			if (temp.next.id == id) {
				temp.next = temp.next.next;
				return;
			}
			temp = temp.next;
		}

		System.out.println("The Emp can't be found!");
	}

	public void showNode() {
		if (head == null) {
			return;
		}

		ListNodeEmp curt = head;
		while (curt.next != null) {
			System.out.print(curt + " ");
			curt = curt.next;
		}

		System.out.println(curt);
	}

	public void findNode(int id) {
		if (head == null) {
			System.out.println("The Emp can't be found!");
			return;
		}

		ListNodeEmp curt = head;
		while (curt != null) {
			if (curt.id == id) {
				System.out.println(curt);
				return;
			}
			curt = curt.next;
		}
		System.out.println("The Emp can't be found!");
	}

}

class ListNodeEmp {
	int id;
	String empName;
	ListNodeEmp next;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public ListNodeEmp getNext() {
		return next;
	}

	public void setNext(ListNodeEmp next) {
		this.next = next;
	}

	@Override
	public String toString() {
		return "[id=" + id + ", empName=" + empName + "]";
	}

	public ListNodeEmp() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ListNodeEmp(int id, String empName) {
		super();
		this.id = id;
		this.empName = empName;
	}

}
