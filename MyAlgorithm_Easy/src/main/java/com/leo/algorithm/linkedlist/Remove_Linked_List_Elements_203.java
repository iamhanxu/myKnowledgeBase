package com.leo.algorithm.linkedlist;

import com.leo.algorithm.basic.ListNode;

/*
 * Remove all elements from a linked list of integers that have value val.

Example
Given: 1 --> 2 --> 6 --> 3 --> 4 --> 5 --> 6, val = 6
Return: 1 --> 2 --> 3 --> 4 --> 5
 */
public class Remove_Linked_List_Elements_203 {

	public ListNode removeElements(ListNode head, int val) {

		if (head == null)
			return null;

		ListNode previous = null;
		ListNode current = head;

		while (current != null) {
			if (current.val == val) {
				// remove current
				ListNode next = current.next;
				if (previous != null) {
					previous.next = current.next;
				} else {
					head = current.next;
				}
				current.next = null;
				current = next;
			} else {
				previous = current;
				current = current.next;
			}
		}

		return head;
	}

}
