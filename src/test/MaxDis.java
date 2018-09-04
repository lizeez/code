package test;


public class MaxDis {
	private int maxlen = 0;
	public void findMaxdis(Node root) {
		if(root == null) return;
		if(root.left == null) {
			root.leftMaxdis = 0;
		}else {
			findMaxdis(root.left);
		}
		if(root.right == null) {
			root.rightMaxdis = 0;
		}else {
			findMaxdis(root.right);
		}
		if(root.left != null) {
			root.leftMaxdis = Math.max(root.left.leftMaxdis, root.left.rightMaxdis)+1;
		}
		if(root.right != null) {
			root.rightMaxdis = Math.max(root.right.leftMaxdis, root.right.rightMaxdis) + 1;
			
		}
		if(root.leftMaxdis + root.rightMaxdis > maxlen){
			maxlen = root.leftMaxdis + root.rightMaxdis;
		}
	}
	
}

class Node{
	public int data;
	public Node left;
	public Node right;
	public int leftMaxdis;
	public int rightMaxdis;
	public Node(int data) {
		this.data = data;
		this.left = null;
		this.right = null;
	}
}
