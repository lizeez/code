package leetcode;

import java.util.LinkedList;
/**
 * Definition for binary tree
 */
class TreeNode{
  	int val;
   TreeNode left;
 	TreeNode right;
 	TreeNode(int x){ val = x; }
}

public class Test1 {
	/**
	 * 思路1：深度优先搜索
	 * 如果当前节点是空，则最小深度为0，返回
	 * 效率低
	 */
	
	public int run(TreeNode root) {
		if(root == null) {
			return 0;
		}
		int l = run(root.left);
		int r = run(root.right);
		if(l==0||r==0) {
			return r+l+1;
		}
		return Math.min(l, r) + 1;		
	}
	
	/**
	 * 思路2：
	 * 广度优先遍历
	 * 找到第一个叶子节点就可以停止遍历
	 * 效率高
	 */
	public int run1(TreeNode root) {
		if(root == null) {
			return 0;
		}
		LinkedList<TreeNode> queue = new LinkedList<TreeNode>();
		LinkedList<TreeNode> layerList = new LinkedList<TreeNode>();
		queue.addFirst(root);
		int start = 0;
		int end = 1;
		int level = 1;
		while(!queue.isEmpty()) {
			TreeNode temp = queue.removeLast();
			start++;
			layerList.addFirst(temp);
			if (temp.left == null && temp.right == null) {
                return level;
            }
            if (temp.left != null) {
                queue.addFirst(temp.left);
            }
            if (temp.right != null) {
                queue.addFirst(temp.right);
            }
            if (start == end) {
                level++;
                start = 0;
                end = queue.size();
                layerList = new LinkedList<TreeNode>();
            }
		}
		return level;
		
	}
}
