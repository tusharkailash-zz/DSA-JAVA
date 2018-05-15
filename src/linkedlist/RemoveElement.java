package linkedlist;


public class RemoveElement {

	public static class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
			next = null;
		}

	}

	public ListNode removeValfromList(ListNode head, int val) {

		ListNode dummy = new ListNode(0);
		ListNode curr = dummy;
		dummy.next = head;

		while (curr.next != null) {

			if (curr.next.val == val) {
				curr.next = curr.next.next;
			} else {
				curr = curr.next;
			}

		}
		return dummy.next;
	}

	public void printList(ListNode head) {

		while (head != null) {

			System.out.print(head.val + "-->");
			head = head.next;

		}
		System.out.print("null");
	}

	public static void main(String[] args) {

		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next= new ListNode(6);
		head.next.next.next = new ListNode(3);
		head.next.next.next.next = new ListNode(4);
		head.next.next.next.next.next = new ListNode(5);
		head.next.next.next.next.next.next = new ListNode(6);
		int val = 6;
		RemoveElement r = new RemoveElement();
		head = r.removeValfromList(head, val);
		r.printList(head);

	}

}
