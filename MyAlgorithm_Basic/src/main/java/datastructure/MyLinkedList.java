package datastructure;

public class MyLinkedList {

	public static class Node {

		private int data;
		private Node next;

		public Node() {
		}

		public Node(int data, Node next) {
			super();
			this.data = data;
			this.next = next;
		}

	}

	private Node head = null;
	private int size = 0;

	public void insert(int data, int position) {

		Node newNode = new Node(data, null);

		if (position == 1) {
			newNode.next = head;
			head = newNode;
			this.size++;
			return;
		}

		Node previous = this.getPreviousNodeForPosition(position);

		if (previous != null) {
			newNode.next = previous.next;
			previous.next = newNode;
			this.size++;
		}
	}

	public void delete(int position) {

		if (position == 1 && head != null) {
			Node current = head;
			head = head.next;
			current.next = null;
			this.size--;
			return;
		}

		Node previous = this.getPreviousNodeForPosition(position);

		if (previous != null && previous.next != null) {
			previous.next = previous.next.next;
			previous.next.next = null;
			this.size--;
		}

	}

	public Node retrieve(int position) {

		if (position == 1) {
			return head;
		}

		Node previous = this.getPreviousNodeForPosition(position);

		if (previous != null) {
			return previous.next;
		}

		return null;
	}

	public int size() {
		return this.size;
	}

	private Node getPreviousNodeForPosition(int position) {

		if (position > this.size + 1 || position <= 1)
			return null;

		Node previous = head;

		for (int i = 2; i < position; i++) {
			previous = previous.next;
		}

		return previous;
	}

	public void printForwardInt() {

		System.out.println("------printForwardInt---------");

		Node current = this.head;
		while (current != null) {
			System.out.print(current.data + " ");
			current = current.next;
		}
		System.out.println();
		System.out.println("-----------------------------");

	}

	public void printForwardRec() {
		System.out.println("------printForwardRec---------");
		this.printForwardRecFunc(this.head);
		System.out.println();
		System.out.println("-----------------------------");
	}

	private void printForwardRecFunc(Node node) {

		if (node == null)
			return;

		System.out.print(node.data + " ");
		this.printForwardRecFunc(node.next);

	}

	public void printBackwardRec() {
		System.out.println("------printBackwardRec---------");
		this.printBackwardRecFunc(this.head);
		System.out.println();
		System.out.println("-----------------------------");
	}

	private void printBackwardRecFunc(Node node) {
		if (node == null)
			return;

		this.printBackwardRecFunc(node.next);
		System.out.print(node.data + " ");
	}

	public void reverseInt() {

		Node current = head;
		Node previous = null;

		while (current != null) {
			Node next = current.next;
			current.next = previous;
			previous = current;
			current = next;
		}

		head = previous;

	}

	public void reverseRec() {

		this.reverseRecFunc(this.head);
	}

	private void reverseRecFunc(Node node) {

		if (node == null || node.next == null) {
			this.head = node;
			return;
		}

		this.reverseRecFunc(node.next);
		node.next.next = node;
		node.next = null;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyLinkedList list = new MyLinkedList();
		list.insert(1, 1);
		list.insert(2, 2);
		list.insert(3, 3);
		list.insert(4, 4);
		list.insert(5, 5);
		
		list.printBackwardRec();
		list.printForwardInt();
		list.printForwardRec();
		
		System.out.println("print normal order");
		list.printForwardInt();
		
		
		list.reverseInt();
		list.printForwardInt();
		
		list.reverseRec();
		list.printForwardInt();
	}

}
