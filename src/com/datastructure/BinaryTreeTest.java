package com.datastructure;

public class BinaryTreeTest {
	public static void main(String[] args) {
		TreeNode t1 = new TreeNode(1);
		TreeNode t2 = new TreeNode(2);
		TreeNode t3 = new TreeNode(3);
		TreeNode t4 = new TreeNode(4);
		TreeNode t5 = new TreeNode(5);
		t1.left = t2;
		t1.right = t3;
		t2.left = t4;
		t2.right = t5;

		BinaryTree bt = new BinaryTree(t1);
		bt.preOrder();
		System.out.println("------------");
		bt.inOrder();
		System.out.println("------------");
		bt.postOrder();
		
		System.out.println(bt.preSearch(1));
	}
}

class BinaryTree {
	TreeNode root;

	public BinaryTree() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BinaryTree(TreeNode root) {
		this.root = root;
	}

	public void preOrder() {
		if (root != null) {
			root.preOrder();
		} else {
			System.out.println("There is no treeNode in this Tree");
		}
	}

	public void inOrder() {
		if (root != null) {
			root.inOrder();
		} else {
			System.out.println("There is no treeNode in this Tree");
		}
	}

	public void postOrder() {
		if (root != null) {
			root.postOrder();
		} else {
			System.out.println("There is no treeNode in this Tree");
		}
	}

	public TreeNode preSearch(int id) {

		if (root != null) {
			return root.preSearch(id);
		} else {
			return null;
		}

	}

	public TreeNode inSearch(int id) {

		if (root != null) {
			return root.inSearch(id);
		} else {
			return null;
		}
	}
	
	public TreeNode postSearch(int id) {

		if (root != null) {
			return root.postSearch(id);
		} else {
			return null;
		}
	}
	
	

}

class TreeNode {
	private int id;
	TreeNode left;
	TreeNode right;

	public TreeNode() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public TreeNode getLeft() {
		return left;
	}

	public void setLeft(TreeNode left) {
		this.left = left;
	}

	public TreeNode getRight() {
		return right;
	}

	public void setRight(TreeNode right) {
		this.right = right;
	}

	public void preOrder() {
		System.out.println(this.id);

		if (this.left != null) {
			this.left.preOrder();
		}

		if (this.right != null) {
			this.right.preOrder();
		}
	}

	public void inOrder() {
		if (this.left != null) {
			this.left.inOrder();
		}

		System.out.println(this.id);

		if (this.right != null) {
			this.right.inOrder();
		}
	}

	public void postOrder() {
		if (this.left != null) {
			this.left.postOrder();
		}

		if (this.right != null) {
			this.right.postOrder();
		}

		System.out.println(this.id);
	}

	public TreeNode preSearch(int id) {
		if (this.id == id) {
			return this;
		}

		TreeNode result = null;
		if (result == null && this.left != null) {
			result = this.left.preSearch(id);
		}

		if (result == null && this.right != null) {
			result = this.right.preSearch(id);
		}

		return result;
	}

	public TreeNode inSearch(int id) {
		TreeNode result = null;
		if (result == null && this.left != null) {
			result = inSearch(id);
		}

		if (this.id == id) {
			return this;
		}

		if (result == null && this.right != null) {
			result = inSearch(id);
		}

		return result;
	}

	public TreeNode postSearch(int id) {
		TreeNode result = null;
		if (result == null && this.left != null) {
			result = inSearch(id);
		}

		if (result == null && this.right != null) {
			result = inSearch(id);
		}

		if (this.id == id) {
			return this;
		}

		return result;
	}

	@Override
	public String toString() {
		return "TreeNode [id=" + id+"]";
	}

	public TreeNode(int id) {
		super();
		this.id = id;
	}

}
