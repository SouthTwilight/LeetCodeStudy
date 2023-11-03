import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @Author: NieXiaoLin
 * @Email: SouthTwilight@outlook.com
 * @Datetime: 2023/11/3 13:47
 * @Project: LeetCode
 * @Package: PACKAGE_NAME
 * @Version: 1.0
 * @ToDo: Java 常用数据结构初始化方法
 */
public class DataStructure {
	/**
	 * @Author: Niexl
	 * @Datetime: 2023/11/3 13:53
	 * @Param: {@link   } 
	 * @Return: void
	 * @TODO: 线性数据结构: 「数组」、「链表」、「栈」、「队列」
	 **/
	public void init_linear_data_structure(){
		/** 数组 */
		// 1. 使用 new 关键字指定长度初始化
		int[] array1 = new int[5]; // 初始化长度
		array1[0] = array1[1] = 1; // 初始化值
		// 2. 直接以数组元素初始化
		int[] array2 = {1,1,3,4,5,1};
		// 3. 使用 API 初始化可变长数组
		List<Integer> array3 = new ArrayList<>();
		array3.addAll(Arrays.asList(1,3,5,6,2));
		
		/** 链表 */
		// 1. 使用简单自建数据结构链表节点
		ListNode n1 = new ListNode(4); // 节点 head
		ListNode n2 = new ListNode(5);
		n1.next = n2; // 构建引用指向
		
		/** 栈 */
		// 1. 通常使用链表实现 栈
		Deque<Integer> stack = new LinkedList<>();
		stack.push(1); // 存入
		Integer peek = stack.peek(); // 取顶值
		Integer pop = stack.pop(); // 弹栈
		
		/** 队列 */
		Queue<Integer> queue = new LinkedList<>();
		queue.offer(1); // 元素 1 入队
		queue.offer(2); // 元素 2 入队
		queue.poll();   // 出队 -> 元素 1
		queue.poll();   // 出队 -> 元素 2
	}

	/**
	 * @Author: Niexl
	 * @Datetime: 2023/11/3 15:15
	 * @Param: {@link   } 
	 * @Return: void
	 * @TODO: 非线性数据结构:「树」、「图」、「散列表」、「堆」
	 **/
	public void init_nonlinear_data_structure(){
		
	}
	

	/**
	 * @Author: Niexl
	 * @Datetime: 2023/11/3 14:59
	 * @Param: {@link null} null
	 * @Return: {@link null}
	 * @TODO: 链表实现，节点数据模型
	 **/
	private class ListNode {
		int val;       // 节点值
		ListNode next; // 后继节点引用
		ListNode(int x) { val = x; }
	}

	/**
	 * @Author: Niexl
	 * @Datetime: 2023/11/3 15:16
	 * @Param: {@link null} null
	 * @Return: {@link null}
	 * @TODO: 二叉树实现，节点数据模型
	 **/
	private class TreeNode {
		int val;        // 节点值
		TreeNode left;  // 左子节点
		TreeNode right; // 右子节点
		TreeNode(int x) { val = x; }
	}
}
