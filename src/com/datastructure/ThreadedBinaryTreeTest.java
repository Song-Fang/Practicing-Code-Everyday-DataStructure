package com.datastructure;

public class ThreadedBinaryTreeTest {

}

class ThreadedBinaryTree{
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
	
	public void threadedBinaryTree(ThreadedTreeNode root) {
		if(root == null) {
			return;
		}
		
		threadedBinaryTree(root.getLeft());
		
		if(root.getLeft()==null) {
			root.setLeft(pre);
			root.setLeftNodeType(1);
			
		}
		
		
		threadedBinaryTree(root.getRight());
	}
	
}


class ThreadedTreeNode{
	private int id;
	ThreadedTreeNode left;
	ThreadedTreeNode right;
	
	int leftNodeType;
	int rightNodeType;
	
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
