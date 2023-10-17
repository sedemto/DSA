package cv5;

public class Tree {
	private TreeNode root;
	private TreeNode deepest = new TreeNode(0,0);
	
	private TreeNode addTreeNode(TreeNode current,int data, int depth) {
		if(current == null)
			return new TreeNode(data,depth);
		if(data > current.getData()) {
			current.setRight(addTreeNode(current.getRight(),data,depth+1));
		}
		else if(data < current.getData()) {
			current.setLeft(addTreeNode(current.getLeft(),data,depth+1));
		}
		return current;
		
	}
	public void add(int data) {
		this.root = addTreeNode(root,data,0);
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

	
	
	
	private void printTreePreOrder(TreeNode current) {
		if(current != null) {
			System.out.print(current.getData()+" ");
			printTreePreOrder(current.getLeft());
			printTreePreOrder(current.getRight());
		}
	}
	private void printTreeInOrder(TreeNode current) {
		if(current != null) {
			printTreeInOrder(current.getLeft());
			System.out.print(current.getData()+" ");
			printTreeInOrder(current.getRight());
		}
	}
	private void printTreePostOrder(TreeNode current) {
		if(current != null) {
			printTreePostOrder(current.getLeft());
			printTreePostOrder(current.getRight());
			System.out.print(current.getData()+" ");
		}
	}
	
	public void printPreOrder() {
		printTreePreOrder(root);
	}
	public void printInOrder() {
		printTreeInOrder(root);
	}
	public void printPostOrder() {
		printTreePostOrder(root);
	}
	
	
	private void printLeaves(TreeNode current) {

		if(current != null) {
			if(current.getLeft() == null && current.getRight() == null)
				System.out.print(current.getData()+" ");
			printLeaves(current.getLeft());
			printLeaves(current.getRight());
		}
	}
	public void printListy() {
		printLeaves(root);
	}
	
	
	private void findDeepest(TreeNode current) {
		if(current != null) {
			if(deepest.depth < current.depth) {
				deepest = current;
			}
			findDeepest(current.getLeft());
			findDeepest(current.getRight());
		}
	}
	public void findD() {
		findDeepest(root);
		System.out.print(deepest.getData());
	}
	
	
}
