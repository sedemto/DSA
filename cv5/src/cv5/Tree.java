package cv5;

public class Tree {
	private TreeNode root;
	
	
	private TreeNode addTreeNode(TreeNode current,int data) {
		if(current == null)
			return new TreeNode(data);
		if(data > current.getData()) {
			current.setRight(addTreeNode(current.getRight(),data));
		}
		else if(data < current.getData()) {
			current.setLeft(addTreeNode(current.getLeft(),data));
		}
		return current;
		
	}
	public void add(int data) {
		this.root = addTreeNode(root,data);
	}

	
	
	
	private boolean containsNode(TreeNode current,int data) {
		if(current == null)
			return false;
		if(data == current.getData()) {
			return true;
		}
		if(data > current.getData()) {
			return containsNode(current.getRight(), data);
		}
		else if(data < current.getData()) {
			return containsNode(current.getLeft(),data);
		}
		return false;
	}
	public boolean contains(int data) {
		return containsNode(root,data);
	}

	
	
	
	private void printTree(TreeNode current) {
		if(current != null) {
			System.out.print(current.getData()+" ");
			printTree(current.getLeft());
			printTree(current.getRight());
		}
	}
	public void print() {
		printTree(root);
	}

}
