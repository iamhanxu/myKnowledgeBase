package datastructure;

public class StackLinkedList {

	private static class Node {
		private int data;
		private Node next;

		public Node(int data, Node next) {
			super();
			this.data = data;
			this.next = next;
		}
	}

	private Node top = null;
	private int size = 0;

	public void push(int i) {
		Node newNode = new Node(i, null);
		newNode.next = top;
		top = newNode;
		this.size++;
	}

	public Integer pop() {

		if (top == null)
			return null;

		Node tmp = top;
		top = top.next;
		tmp.next = null;
		this.size--;
		return tmp.data;

	}

	public Integer peek() {

		if (top == null)
			return null;

		return top.data;

	}

	public boolean isEmpty() {
		return this.size == 0;
	}

	public static void main(String[] args) {

		StackLinkedList stack = new StackLinkedList();
		
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		
		while(!stack.isEmpty()){
			System.out.println(stack.pop());
		}
		
	}

}
