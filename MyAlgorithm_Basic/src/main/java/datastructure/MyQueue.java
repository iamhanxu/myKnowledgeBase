package datastructure;

public class MyQueue {

	private static class Node {
		private int data;
		private Node next;

		public Node(int data, Node next) {
			this.data = data;
			this.next = next;
		}

	}

	private Node front = null;
	private Node rear = null;
	private int size = 0;

	public void enQueue(int i) {
		Node newNode = new Node(i, null);
		if (front == null && rear == null) {
			front = rear = newNode;
		} else {
			rear.next = newNode;
			rear = newNode;
		}
		this.size++;
	}

	public Integer deQueue() {

		if (front == null && rear == null) {
			return null;
		} else if (front == rear) {
			int data = front.data;
			front = rear = null;
			this.size--;
			return data;
		}

		Node tmp = front;
		front = front.next;
		this.size--;
		tmp.next = null;
		return tmp.data;
	}

	public Integer front() {
		if (front == null && rear == null) {
			return null;
		} else {
			return front.data;
		}
	}

	public boolean isEmpty() {
		return this.size == 0;
	}

	public static void main(String[] args) {
		MyQueue queue = new MyQueue();

		queue.enQueue(1);
		queue.enQueue(2);
		queue.enQueue(3);
		queue.enQueue(4);
		queue.enQueue(5);

		while (!queue.isEmpty()) {
			System.out.println(queue.deQueue());
		}

	}

}
