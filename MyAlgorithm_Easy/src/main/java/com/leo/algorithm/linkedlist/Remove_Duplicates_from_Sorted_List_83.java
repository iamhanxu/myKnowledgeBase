package com.leo.algorithm.linkedlist;

import com.leo.algorithm.basic.ListNode;

/*
 * Given a sorted linked list, delete all duplicates such that each element appear only once.

For example,
Given 1->1->2, return 1->2.
Given 1->1->2->3->3, return 1->2->3.

 */
public class Remove_Duplicates_from_Sorted_List_83 {
	public ListNode deleteDuplicates(ListNode head) {

		if (head == null || head.next == null)
			return head;

		ListNode previous = head;
		ListNode current = head.next;

		while (current != null) {
			if (previous.val == current.val) {
				ListNode next = current.next;
				previous.next = current.next;
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
