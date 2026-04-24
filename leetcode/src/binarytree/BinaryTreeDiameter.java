package binarytree;

public class BinaryTreeDiameter {
	int diameter=0;	
	public static void main(String[] args) {
		
		TreeNode root = new TreeNode(40);
		root.left = new TreeNode(20);
		root.left.left = new TreeNode(10);
		root.left.right = new TreeNode(30);
		root.right = new TreeNode(70);
		BinaryTreeDiameter test = new BinaryTreeDiameter();
		System.out.println(test.diameterTreeNode(root));
	}
	
	private static class TreeNode {		
		int val;
		TreeNode left;
		TreeNode right;		
		TreeNode(int val){
			this.val=val;
		}
	}
	
	public int diameterTreeNode(TreeNode node) {
		height(node);
		return diameter;
	}
	
	public int height(TreeNode node) {
		if(node==null) return 0;
		int left=height(node.left);
		int right=height(node.right);
		diameter=Math.max(diameter, left+right);
		return 1+Math.max(left, right);
	}
}
