package datastructure;

import java.util.Deque;
import java.util.LinkedList;

/*
 * 
 * For BST , usually, left child less than the parent, right child bigger than parent
 * 
 * 
 * 
 */
public class MyBSTOne {

	public static class Node {
		private int data;
		private Node left = null;
		private Node right = null;

		public Node(int data) {
			this.data = data;
		}
	}

	private Node root = null;

	public void insert(int i) {
		if (root == null) {
			root = new Node(i);
		} else {
			this.insertNode(i, root);
		}
	}

	private void insertNode(int i, Node current) {

		if (current.data > i) {
			// go left

			if (current.left == null) {
				current.left = new Node(i);
				return;
			} else {
				this.insertNode(i, current.left);
			}
		} else {
			// go right
			if (current.right == null) {
				current.right = new Node(i);
				return;
			} else {
				this.insertNode(i, current.right);
			}
		}

	}

	public Node search(int i) {
		return this.searchNode(i, root);
	}

	private Node searchNode(int i, Node current) {
		if (current == null || current.data == i)
			return current;

		if (i < current.data) {
			// go left
			return this.searchNode(i, current.left);
		} else {
			// go right
			return this.searchNode(i, current.right);
		}
	}

	public void delete(int i) {
		this.deleteNode(i, root, null);
	}

	private void deleteNode(int i, Node current, Node parent) {
		if (current == null)
			return;

		if (current.data == i) {

			if (current.left == null && current.right == null) {
				// deleted element has no children
				if (parent.left == current) {
					parent.left = null;
				} else {
					parent.right = null;
				}
			} else if (current.left != null && current.right == null) {
				// deleted element has left child
				if (parent.left == current) {
					parent.left = current.left;
					current.left = null;
				} else {
					parent.right = current.left;
					current.left = null;
				}
			} else if (current.right != null && current.left == null) {
				// deleted element has right child
				if (parent.left == current) {
					parent.left = current.right;
					current.right = null;
				} else {
					parent.right = current.right;
					current.right = null;
				}
			} else {

				// find the left max node, and
				// replace the current node's value with the
				// left max node's value
				// remove the left max node

				Node lMax = this.getMaxNode(current);

				current.data = lMax.data;

				this.deleteNode(lMax.data, current.left, current);

			}

		} else if (i < current.data) {
			// go left
			this.deleteNode(i, current.left, current);
		} else {
			// go right
			this.deleteNode(i, current.right, current);
		}
	}

	public Node getMaxTreeNode() {
		return this.getMaxNode(root);
	}

	private Node getMaxNode(Node current) {
		if (current == null || current.right == null)
			return current;

		return this.getMaxNode(current.right);
	}

	public Node getMinTreeNode() {
		return this.getMinNode(root);
	}

	private Node getMinNode(Node current) {
		if (current == null || current.left == null)
			return current;

		return this.getMinNode(current.left);
	}

	public int getTreeHeight() {
		return this.getHeight(root);
	}

	private int getHeight(Node current) {
		if (current == null)
			return -1;
		return Math.max(this.getHeight(current.left), this.getHeight(current.right)) + 1;
	}

	public void dfs_in_order() {
		System.out.println("----DFS---IN---ORDER------");
		this.dfs_in_order(root);
		System.out.println();
		System.out.println("--------------------------");
	}

	private void dfs_in_order(Node current) {
		if (current == null)
			return;
		this.dfs_in_order(current.left);
		System.out.print(current.data + " ");
		this.dfs_in_order(current.right);
	}

	public void dfs_pre_order() {
		System.out.println("----DFS---IN---ORDER------");
		this.dfs_pre_order(root);
		System.out.println();
		System.out.println("--------------------------");
	}

	private void dfs_pre_order(Node current) {
		if (current == null)
			return;
		System.out.print(current.data + " ");
		this.dfs_pre_order(current.left);
		this.dfs_pre_order(current.right);
	}

	public void dfs_post_order() {
		System.out.println("----DFS---IN---ORDER------");
		this.dfs_post_order(root);
		System.out.println();
		System.out.println("--------------------------");
	}

	private void dfs_post_order(Node current) {
		if (current == null)
			return;
		this.dfs_post_order(current.left);
		this.dfs_post_order(current.right);
		System.out.print(current.data + " ");
	}

	public void bfs() {
		if (root == null)
			return;

		Deque<Node> queue = new LinkedList<Node>();
		queue.addLast(root);

		while (!queue.isEmpty()) {
			Node out = queue.removeFirst();
			System.out.print(out.data);
			if (out.left != null) {
				queue.addLast(out.left);
			}
			if (out.right != null) {
				queue.addLast(out.right);
			}
		}
	}

	public static void main(String[] args) {

		MyBSTOne bst = new MyBSTOne();
		
		bst.insert(10);
		bst.insert(100);
		bst.insert(-10);
		bst.insert(80);
		bst.insert(2);
		bst.insert(41);
		bst.insert(3);
		bst.insert(15);
		
		
		bst.dfs_in_order();
		
	}

}
