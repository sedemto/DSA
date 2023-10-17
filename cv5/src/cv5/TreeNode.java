package cv5;

public class TreeNode {
	private TreeNode left;
	private TreeNode right;
	private int data;
	
	public TreeNode(int data) {
		this.data = data;
		this.right = null;
		this.left = null;
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
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	
	
	
}
