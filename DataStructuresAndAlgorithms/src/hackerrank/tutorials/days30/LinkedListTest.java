package hackerrank.tutorials.days30;

import java.util.Scanner;

public class LinkedListTest {

	public static void main(final String[] args) {
		Scanner in = new Scanner(System.in);
		Node head = null;
		int T = in.nextInt();
		int[] a = new int[T];
		for (int i = 0; i < T; i++) {
			a[i] = in.nextInt();
		}
		for (int i = 0; i < T; i++) {
			head = insert(head, a[i]);
		}
		display(head);
		in.close();
	}

	public static Node insert(final Node head, final int data) {
		if (head == null) {
			return new Node(data);
		}
		Node tail = head;
		while (tail.next != null) {
			tail = tail.next;
		}
		tail.next = new Node(data);
		return head;
	}

	public static void display(final Node head) {
		Node start = head;
		while (start != null) {
			System.out.print(start.data + " ");
			start = start.next;
		}
	}

}

class Node {
	int data;
	Node next;

	Node() {
	}

	Node(final int data) {
		this.data = data;
		this.next = null;
	}
}
