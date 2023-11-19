package linkedlist;

import java.util.List;

/**
 * @Author: NieXiaoLin
 * @Email: SouthTwilight@outlook.com
 * @Datetime: 2023/11/6 10:15
 * @Project: LeetCodeStudy
 * @Package: linkedlist
 * @Version: 1.0
 * @ToDo: 给定一个头节点为 head 的单链表用于记录一系列核心肌群训练编号，请将该系列训练编号 倒序 记录于链表并返回。
 * <p>
 * 示例：输入：head = [1,2,3,4,5]
 *      输出：[5,4,3,2,1]
 */
public class Question_3 {

    /**
     * @Author: SouthTwilight
     * @Email: SouthTwilight@outlook.com
     * @Datetime: 2023/11/19 15:49
     * @Param: {@link ListNode} head
     * @Return: {@link ListNode}
     * @TODO: 头插法
     **/
    public ListNode trainingPlan(ListNode head) {
        if (head==null || head.next==null) return head;
        ListNode newHead = new ListNode();
        ListNode cur;
        ListNode pre = cur = head;
        newHead.next = head;
        while(pre.next != null){
            ListNode temp = pre.next;
            pre.next = temp.next;
            cur = newHead.next;
            newHead.next = temp;
            temp.next = cur;
        }
        return newHead.next;
    }

    /**
     * @Author: SouthTwilight
     * @Email: SouthTwilight@outlook.com
     * @Datetime: 2023/11/19 15:41
     * @Param: {@link ListNode} head
     * @Return: {@link ListNode}
     * @TODO: 尾插法
     **/
    public ListNode reverseList(ListNode head) {
        ListNode p = null;
        ListNode h = null;
        while(head != null){
            h = head;
            head = head.next;
            h.next = p;
            p = h;
        }
        return p;
    }




    public static void main(String[] args) {
        Question_3 question_3 = new Question_3();
        ListNode head = new ListNode();
        ListNode a1 = new ListNode(1);head.next=a1;
        ListNode a2 = new ListNode(2);a1.next=a2;
        ListNode a3 = new ListNode(3);a2.next=a3;
        ListNode a4 = new ListNode(4);a3.next=a4;
        ListNode a5 = new ListNode(5);a4.next=a5;

        ListNode temp = a1;
        while (temp != null){
            System.out.println(temp.val);
            temp=temp.next;
        }

//        ListNode temp1 = question_3.trainingPlan(a1);
        ListNode temp1 = question_3.reverseList(a1);
        while (temp1 != null){
            System.out.println(temp1.val);
            temp1=temp1.next;
        }
    }
}

