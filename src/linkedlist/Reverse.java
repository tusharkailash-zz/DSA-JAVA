package linkedlist;

public class Reverse {
	public static class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
			next = null;
		}
	}

	public ListNode reverseLinkedList(ListNode head) {

		ListNode prev = null;
		ListNode curr = head;
		while (curr != null) {

			ListNode next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;

		}
		return prev;
	}

	public void printList(ListNode head) {

		while (head != null) {

			System.out.print(head.val + "->");
			head = head.next;
		}
		System.out.println("null");
	}

	public static void main(String[] args) {

		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(4);
		head.next.next.next.next = new ListNode(5);
		Reverse r = new Reverse();
		r.printList(head);
		head = r.reverseLinkedList(head);
		r.printList(head);

	}
}