package com.leo.algorithm.linkedlist;

import java.util.HashSet;
import java.util.Set;

import com.leo.algorithm.basic.ListNode;

/*
 * Write a program to find the node at which the intersection of two singly linked lists begins.


For example, the following two linked lists:

A:          a1 -> a2
                     ->
                        c1 -> c2 -> c3
                     ->            
B:     b1 -> b2 -> b3
begin to intersect at node c1.


Notes:

If the two linked lists have no intersection at all, return null.
The linked lists must retain their original structure after the function returns.
You may assume there are no cycles anywhere in the entire linked structure.
Your code should preferably run in O(n) time and use only O(1) memory.
 */
public class Intersection_of_Two_Linked_Lists_160 {

	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

		Set<ListNode> set = new HashSet<ListNode>();

		while (headA != null) {
			set.add(headA);
			headA = headA.next;
		}

		while (headB != null) {
			if (set.contains(headB)) {
				return headB;
			} else {
				set.add(headB);
				headB = headB.next;
			}
		}

		return null;

	}

	// O(1) memory
	public ListNode getIntersectionNode1(ListNode headA, ListNode headB) {

		int la = getLength(headA);
		int lb = getLength(headB);

		if (la > lb) {
			int count = la - lb;
			while (count > 0) {
				headA = headA.next;
				count--;
			}

		} else {
			int count = lb - la;
			while (count > 0) {
				headB = headB.next;
				count--;
			}
		}

		while (headA != null && headB != null) {
			if (headA.val == headB.val)
				return headA;
			headA = headA.next;
			headB = headB.next;
		}

		return null;

	}

	private int getLength(ListNode node) {
		int count = 0;
		while (node != null) {
			count++;
			node = node.next;
		}
		return count;
	}

}
