package cv4;

public class MyList {
	private MyListNode head = new MyListNode(0);
	
	public void addToStart(int data) {
		head.next = new MyListNode(data,head.next);
	}
	public void removeFromStart() {
		MyListNode current = head.next;
		MyListNode previous = head;
		if(current ==null)
			return;
		if(current != null) {
			previous.next = current.next;
			return;
		}
	}
	public int length(){
		int count = 0;
		MyListNode current = head.next;
		while(current != null) {
			count++;
			current = current.next;
		}
		return count;
	}
	
	public boolean empty() {
		return head.next == null;
	}
	public void print() {
		if(head != null){
            MyListNode currentNode = head.next;
            while(currentNode.next != null){
                System.out.println(currentNode.data);
                currentNode = currentNode.next;
            }
            System.out.println(currentNode.data);
		}
	}
	public boolean contains(int data) {
		MyListNode current = head.next;
		while(current != null) {
			if (current.data == data)
				return true;
			current = current.next;
		}
		return false;
	}
	public void reverse() {
		MyList result =new MyList();
		MyListNode current = head.next;
		while(current != null) {
			result.addToStart(current.data);
			current = current.next;
		}
		this.head = result.head;
	}
}
