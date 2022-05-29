package codinginterview.easy;

public class _0206_ReverseLinkedList {

	static class ListNode {
		int data;
		ListNode next;

		public ListNode(int data) {
			this.data = data;
		}
	}

	public ListNode reverse(ListNode node) {

		ListNode prev = null;
		ListNode next = null;
		ListNode current = node;

		while (current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}

		return prev;
	}

	public static void main(String[] args) {

		ListNode node1 = new ListNode(10);
		ListNode node2 = new ListNode(20);
		ListNode node3 = new ListNode(30);
		ListNode node4 = new ListNode(40);
		ListNode node5 = new ListNode(50);
		ListNode node6 = new ListNode(60);

		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		node5.next = node6;

		_0206_ReverseLinkedList list = new _0206_ReverseLinkedList();
		ListNode reverse = list.reverse(node1);

		while (reverse != null) {
			System.out.println(reverse.data);
			reverse = reverse.next;
		}

	}

}
