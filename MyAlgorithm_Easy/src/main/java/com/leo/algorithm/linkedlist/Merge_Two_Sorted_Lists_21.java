package com.leo.algorithm.linkedlist;

import com.leo.algorithm.basic.ListNode;

/*
 * Merge two sorted linked lists and return it as a new list. 
 * The new list should be made by splicing together the nodes of the first two lists.
 */
public class Merge_Two_Sorted_Lists_21 {
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

		if (l1 == null) {
			return l2;
		}
		if (l2 == null) {
			return l1;
		}

		ListNode head = null;
		ListNode previous = null;

		while (l1 != null && l2 != null) {

			if (l1.val < l2.val) {
				if (previous == null) {
					head = l1;
					previous = l1;
				} else {
					previous.next = l1;
					previous = l1;
				}
				l1 = l1.next;
			} else {
				if (previous == null) {
					head = l2;
					previous = l2;
				} else {
					previous.next = l2;
					previous = l2;
				}
				l2 = l2.next;
			}
		}

		if (l1 != null) {
			previous.next = l1;
		}

		if (l2 != null) {
			previous.next = l2;
		}

		return head;

	}
}
