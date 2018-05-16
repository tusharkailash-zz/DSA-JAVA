package linkedlist;

public class Palindrome {

	public static class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
			next = null;
		}
	}

	public boolean isPallindrome(ListNode head) {

		ListNode slow = head;
		ListNode fast = head;

		while (fast != null && fast.next != null) {

			slow = slow.next;
			fast = fast.next.next;
		}

		ListNode node = null;

		while (slow != null) {
			ListNode next = slow.next;
			slow.next = node;
			node = slow;
			slow = next;

		}

		while (node != null) {

			if (head.val != node.val) {
				return false;
			} else {
				head = head.next;
				node = node.next;
			}
		}
		return true;
	}

	public static void main(String[] args) {

		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(2);
		head.next.next.next.next = new ListNode(1);
		Palindrome p = new Palindrome();
		System.out.println(p.isPallindrome(head));

	}

}
