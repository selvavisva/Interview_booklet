package binarytree;

public class MaximumDepth {
	
	public static void main(String[] args) {
		TreeNode root = new TreeNode(3);
		root.left = new TreeNode(9);
		root.right = new TreeNode(20);
		root.right.left = new TreeNode(15);
		root.right.right = new TreeNode(7);
		System.out.println(maxDepth(root));
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
	
	public static int maxDepth(TreeNode node) {
		
		if(node==null) return 0;
		
		int left=maxDepth(node.left);
		int right=maxDepth(node.right);
		
		return 1+Math.max(left, right);
		
		
	}

}
