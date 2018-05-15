package linkedlist;

public class CycleLinkedList {

	public static class ListNode {

		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
			next = null;
		}
	}

	public boolean hasCycle(ListNode head) {

		ListNode slow = head;
		ListNode fast = head;

		while (fast!= null && fast.next != null) {

			slow = slow.next;
			fast = fast.next.next;
			if (slow == fast) {
				return true;
			} 
		
		}

		return false;
//		return slow ==fast;
	}

	public static void main(String[] args) {

		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		ListNode p = head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(4);
		head.next.next.next.next = new ListNode(5);
		head.next.next.next.next.next = p;
		CycleLinkedList c = new CycleLinkedList();
		System.out.println(c.hasCycle(head));

	}

}
