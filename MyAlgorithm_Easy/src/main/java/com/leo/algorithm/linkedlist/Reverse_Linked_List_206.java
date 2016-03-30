package com.leo.algorithm.linkedlist;

import com.leo.algorithm.basic.ListNode;


/*
 * 
 * Reverse a singly linked list.

Hint:
A linked list can be reversed either iteratively or recursively. Could you implement both?
 * 
 * 
 * 
 */
public class Reverse_Linked_List_206 {

	public ListNode reverseList(ListNode head) {

		ListNode current = head;
		ListNode previous = null;

		while (current != null) {
			ListNode next = current.next;
			current.next = previous;
			previous = current;
			current = next;
		}

		return previous;
	}

	public ListNode reverseList1(ListNode head) {
		if (head == null || head.next == null)
			return head;

		ListNode result = reverseList(head.next);
		head.next.next = head;
		head.next = null;
		return result;

	}

}
