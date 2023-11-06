package linkedlist;

/**
 * @Author: NieXiaoLin
 * @Email: SouthTwilight@outlook.com
 * @Datetime: 2023/11/6 10:15
 * @Project: LeetCodeStudy
 * @Package: linkedlist
 * @Version: 1.0
 * @ToDo: 给定单向链表的头指针和一个要删除的节点的值，定义一个函数删除该节点。返回删除后的链表的头节点。
 * 
 * 示例：输入: head = [4,5,1,9], val = 1
 * 		输出: [4,5,9]
 * 		解释: 给定你链表中值为 1 的第三个节点，那么在调用了你的函数之后，该链表应变为 4 -> 5 -> 9.
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