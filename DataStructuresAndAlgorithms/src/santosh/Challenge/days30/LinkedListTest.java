package santosh.Challenge.days30;

import java.util.Scanner;

public class LinkedListTest {

	public static void main(String[] args) {
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

	public static Node insert(Node head, int data) {
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

	public static void display(Node head) {
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

	Node(int data) {
		this.data = data;
		next = null;
	}
}
