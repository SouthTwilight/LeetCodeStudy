package linkedlist;

/**
 * @Author: NieXiaoLin
 * @Email: SouthTwilight@outlook.com
 * @Datetime: 2023/11/6 10:15
 * @Project: LeetCodeStudy
 * @Package: linkedlist
 * @Version: 1.0
 * @ToDo: 给定两个以 有序链表 形式记录的训练计划 l1、l2，分别记录了两套核心肌群训练项目编号，请合并这两个训练计划，按训练项目编号 升序 记录于链表并返回。
 * <p>
 * 示例：输入：l1 = [1,2,4], l2 = [1,3,4]
 *      输出：[1,1,2,3,4,4]
 */
public class Question_5 {
    public ListNode trainningPlan(ListNode l1, ListNode l2) {
        ListNode head = new ListNode();
        ListNode cur = head;
        while (l1!=null && l2!=null){
            if(l1.val>l2.val){
                cur.next = l2;
                l2 = l2.next;
            }else{
                cur.next = l1;
                l1 = l1.next;
            }
            cur = cur.next;
        }
        if(l1!=null){
            cur.next=l1;
        }
        if(l2!=null){
            cur.next=l2;
        }
        return head.next;
    }
}
