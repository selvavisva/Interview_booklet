package binarytree;

public class BinaryTreeMaxSum {
	int  maxSum=0;
	public static void main(String[] args) {
		TreeNode root = new TreeNode(-10);
		root.left = new TreeNode(9);
		root.right = new TreeNode(20);
		root.right.left = new TreeNode(15);
		root.right.right = new TreeNode(7);
		BinaryTreeMaxSum sum = new BinaryTreeMaxSum();
		System.out.println(sum.maxSum(root));
	}
	
    
	private static class TreeNode{		
		int val;
		TreeNode left;
		TreeNode right;
		
		TreeNode(){};
		
		TreeNode(int val){
			this.val=val;
		}
		
		TreeNode(int val, TreeNode left,TreeNode right){			
			this.val=val;
			this.left=left;
			this.right=right;
		}
	}
	
	private int maxSum(TreeNode node) {
		dfs(node);
		return maxSum;
	}
	private int dfs(TreeNode node) {
		if (node==null) return 0;
		
		int left=Math.max(0, dfs(node.left));
		int right=Math.max(0,dfs(node.right));
		
		int pathSum = node.val+left+right;
		
		maxSum=Math.max(maxSum, pathSum);
		
		return node.val+Math.max(left,right);
		
	}

}
