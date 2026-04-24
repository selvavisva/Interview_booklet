package binarytree;

public class MinValue {
	
	public static void main(String[] args) {
		TreeNode root = new TreeNode(3);
		root.left = new TreeNode(9);
		root.right = new TreeNode(20);
		root.right.left = new TreeNode(15);
		root.right.right = new TreeNode(7);
		System.out.println(minValue(root));
		System.out.println(maxValue(root));
	}
	
	private static class TreeNode{
		int val;
		TreeNode left;
		TreeNode right;
		
		TreeNode(){};
		
		TreeNode(int val){
			this.val=val;
		}
		
	}
	
	public static int minValue(TreeNode node) {
		
		if(node==null) return Integer.MAX_VALUE;
		
		int left = minValue(node.left);
		int right = minValue(node.right);
		
		return Math.min(node.val, Math.min(left, right));
		
	}
	
	public static int maxValue(TreeNode node) {
		
		if(node==null) return Integer.MIN_VALUE;
		
		int left=maxValue(node.left);
		int right=maxValue(node.right);
		
		return Math.max(node.val, Math.max(left, right));
		
		
	}
}
