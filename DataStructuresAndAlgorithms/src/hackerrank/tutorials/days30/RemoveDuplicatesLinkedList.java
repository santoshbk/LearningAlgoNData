package hackerrank.tutorials.days30;

import java.util.Scanner;

public class RemoveDuplicatesLinkedList {

	public static Node insert(Node head, final int data) {
		Node p = new Node(data);
		if (head == null) {
			head = p;
		} else if (head.next == null) {
			head.next = p;
		} else {
			Node start = head;
			while (start.next != null) {
				start = start.next;
			}
			start.next = p;

		}
		return head;
	}

	public static void display(final Node head) {
		Node start = head;
		while (start != null) {
			System.out.print(start.data + " ");
			start = start.next;
		}
	}

	public static void main(final String args[]) {
		Scanner sc = new Scanner(System.in);
		Node head = null;
		int T = sc.nextInt();
		while (T-- > 0) {
			int ele = sc.nextInt();
			head = insert(head, ele);
		}
		head = removeDuplicates(head);
		display(head);

	}

	private static Node removeDuplicates(final Node head) {
		if (head == null || head.next == null) {
			return head;
		}
		Node current = head;
		while (current.next != null) {
			if (current.data == current.next.data) {
				current.next = current.next.next;
			} else {
				current = current.next;
			}
		}
		return head;
	}
}
