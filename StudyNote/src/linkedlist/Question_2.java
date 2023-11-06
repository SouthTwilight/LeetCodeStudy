package linkedlist;

/**
 * @Author: NieXiaoLin
 * @Email: SouthTwilight@outlook.com
 * @Datetime: 2023/11/6 10:15
 * @Project: LeetCodeStudy
 * @Package: linkedlist
 * @Version: 1.0
 * @ToDo:
 */
public class Question_2 {
	public ListNode deleteNode(ListNode head, int val) {
		ListNode first = new ListNode(-1);
		first.next = head;
		ListNode returnNode = first;
		while (first.next != null){
			if(first.next.val == val) {
				first.next = first.next.next;
				break;
			}
			first = first.next;
		}
		return returnNode.next;
	}

	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}
}