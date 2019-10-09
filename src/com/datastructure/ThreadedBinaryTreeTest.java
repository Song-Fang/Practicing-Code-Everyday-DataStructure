package com.datastructure;

public class ThreadedBinaryTreeTest {
	public static void main(String[] args) {
		ThreadedTreeNode t1 = new ThreadedTreeNode(1);
		ThreadedTreeNode t2 = new ThreadedTreeNode(2);
		ThreadedTreeNode t3 = new ThreadedTreeNode(3);
		ThreadedTreeNode t4 = new ThreadedTreeNode(4);
		ThreadedTreeNode t5 = new ThreadedTreeNode(5);
		t1.setLeft(t2);
		t1.setRight(t3);
		t2.setLeft(t4);
		t2.setRight(t5);
		
		ThreadedBinaryTree tt = new ThreadedBinaryTree();
		tt.threadedBinaryTree(t1);
		tt.listBinaryTree(t1);
		
	}
}

class ThreadedBinaryTree {
	ThreadedTreeNode root;
	ThreadedTreeNode pre;

	public ThreadedBinaryTree(ThreadedTreeNode root) {
		super();
		this.root = root;
	}

	public ThreadedBinaryTree() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void threadedBinaryTree(ThreadedTreeNode node) {
		if (node == null) {
			return;
		}

		threadedBinaryTree(node.getLeft());

		if (node.getLeft() == null) {
			node.setLeft(pre);
			node.setLeftNodeType(1);

		}

		if (pre != null && pre.getRight() == null) {
			pre.setRight(node);
			pre.setRightNodeType(1);
		}

		pre = node;
		
		threadedBinaryTree(node.getRight());
	}

	public void listBinaryTree(ThreadedTreeNode nodeTree) {
		ThreadedTreeNode node = nodeTree;
		while (node != null) {
			while (node.getLeftNodeType() == 0) {
				node = node.getLeft();
			}
			System.out.println(node.getId());

			while (node.getRightNodeType() == 1) {
				node = node.getRight();
				System.out.println(node.getId());
			}

			node = node.getRight();
		}

	}

}

class ThreadedTreeNode {
	private int id;
	ThreadedTreeNode left;
	ThreadedTreeNode right;

	int leftNodeType;
	int rightNodeType;

	public ThreadedTreeNode(int id) {
		super();
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public ThreadedTreeNode getLeft() {
		return left;
	}

	public void setLeft(ThreadedTreeNode left) {
		this.left = left;
	}

	public ThreadedTreeNode getRight() {
		return right;
	}

	public void setRight(ThreadedTreeNode right) {
		this.right = right;
	}

	public int getLeftNodeType() {
		return leftNodeType;
	}

	public void setLeftNodeType(int leftNodeType) {
		this.leftNodeType = leftNodeType;
	}

	public int getRightNodeType() {
		return rightNodeType;
	}

	public void setRightNodeType(int rightNodeType) {
		this.rightNodeType = rightNodeType;
	}

	@Override
	public String toString() {
		return "ThreadedTreeNode [id=" + id + "]";
	}

}
