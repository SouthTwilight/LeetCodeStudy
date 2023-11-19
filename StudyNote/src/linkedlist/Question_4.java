package linkedlist;


/**
 * @Author: NieXiaoLin
 * @Email: SouthTwilight@outlook.com
 * @Datetime: 2023/11/6 10:15
 * @Project: LeetCodeStudy
 * @Package: linkedlist
 * @Version: 1.0
 * @ToDo: 给定一个头节点为 head 的链表用于记录一系列核心肌群训练项目编号，请查找并返回倒数第 cnt 个训练项目编号。
 * <p>
 * 示例：输入：head = [2,4,7,8], cnt = 1
 *      输出：8
 */
public class Question_4 {
    public ListNode trainingPlan(ListNode head, int cnt) {
        int count = 0;
        ListNode pre = head;
        ListNode cur = pre;
        while (cur != null){
            if(count<cnt){
                count++;
                cur=cur.next;
            }else{
                pre=pre.next;
                cur=cur.next;
            }
        }
        return pre;
    }
}
