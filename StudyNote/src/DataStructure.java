import java.util.*;

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
		/** 树 */
		TreeNode n1 = new TreeNode(3); // 根节点 root
		TreeNode n2 = new TreeNode(4);
		TreeNode n3 = new TreeNode(5);
		n1.left = n2;
		n1.right = n3;

		/** 图 */
		// 顶点集合： vertices = {1, 2, 3, 4, 5}
		// 边集合： edges = {(1, 2), (1, 3), (1, 4), (1, 5), (2, 4), (3, 5), (4, 5)}
		// 1. 邻接矩阵： 使用数组 vertices 存储顶点，邻接矩阵 edges 存储边
		/** 邻接矩阵的大小只与节点数量有关，即 N^2 ，其中 N 为节点数量。因此，当边数量明显少于节点数量时，
		 * 使用邻接矩阵存储图会造成较大的内存浪费。*/
		int[] vertices1 = {1, 2, 3, 4, 5};
		int[][] edges1 = {{0, 1, 1, 1, 1},
				{1, 0, 0, 1, 0},
				{1, 0, 0, 0, 1},
				{1, 1, 0, 0, 1},
				{1, 0, 1, 1, 0}};
		// 2. 邻接表：使用数组 vertices 存储顶点，邻接表 edges 存储边；edges 为一个二维容器，第一维 i 代表顶点索引，
		// 第二维 edges[i] 存储此顶点对应的边集和；
		/** 邻接表 适合存储稀疏图（顶点较多、边较少）； 邻接矩阵 适合存储稠密图（顶点较少、边较多） */
		int[] vertices2 = {1, 2, 3, 4, 5};
		List<List<Integer>> edges2 = new ArrayList<>();
		List<Integer> edge_1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
		List<Integer> edge_2 = new ArrayList<>(Arrays.asList(0, 3));
		List<Integer> edge_3 = new ArrayList<>(Arrays.asList(0, 4));
		List<Integer> edge_4 = new ArrayList<>(Arrays.asList(0, 1, 4));
		List<Integer> edge_5 = new ArrayList<>(Arrays.asList(0, 2, 3));
		edges2.add(edge_1);
		edges2.add(edge_2);
		edges2.add(edge_3);
		edges2.add(edge_4);
		edges2.add(edge_5);


		/** 散列表 */
		Map<String, Integer> dic = new HashMap<>();

		/** 堆 */
		/** 堆是一种基于「完全二叉树」的数据结构，可使用数组实现。*/
		// 初始化小顶堆: 使用「优先队列」的「压入 push()」和「弹出 pop()」操作，即可完成堆排序
		Queue<Integer> heap = new PriorityQueue<>();
		// 元素入堆
		heap.add(1);
		heap.add(4);
		heap.add(2);
		heap.add(6);
		heap.add(8);
		// 元素出堆（从小到大）
		heap.poll(); // -> 1
		heap.poll(); // -> 2
		heap.poll(); // -> 4
		heap.poll(); // -> 6
		heap.poll(); // -> 8
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
