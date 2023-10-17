package cv4;

public class MyListNode {
	public int data;
	public MyListNode next;
	
	public MyListNode(int data) {
		this.data = data;
		this.next = null;
	}
	public MyListNode(int data, MyListNode next) {
		this.data = data;
		this.next = next;
	}
	public void addNext(MyListNode next) {
		this.next = next;
	}
}
