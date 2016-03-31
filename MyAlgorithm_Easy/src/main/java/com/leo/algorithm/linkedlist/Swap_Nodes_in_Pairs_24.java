package com.leo.algorithm.linkedlist;

import com.leo.algorithm.basic.ListNode;

/*
 * Given a linked list, swap every two adjacent nodes and return its head.

For example,
Given 1->2->3->4, you should return the list as 2->1->4->3.

Your algorithm should use only constant space. You may not modify the values in the list, only nodes itself can be changed.

 */
public class Swap_Nodes_in_Pairs_24 {

	public ListNode swapPairs(ListNode head) {
		if (head == null || head.next == null)
			return head;

		ListNode previous = null;
		ListNode first = head;
		ListNode second = head.next;

		while (first != null && second != null) {
			first.next = second.next;
			second.next = first;

			if (previous != null) {
				previous.next = second;
			} else {
				head = second;
			}

			previous = first;
			previous.next = first.next;
			if (first.next == null) {
				first = null;
				second = null;
			} else {
				second = first.next.next;
				first = first.next;
			}
		}
		return head;

	}

}
