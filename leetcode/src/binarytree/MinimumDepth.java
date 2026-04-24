package binarytree;


public class MinimumDepth {
	
	public static void main(String[] args) {
		TreeNode root = new TreeNode(3);
		root.left = new TreeNode(9);
		root.right = new TreeNode(20);
		root.right.left = new TreeNode(15);
		root.right.right = new TreeNode(7);
		System.out.println(minDepth(root));
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
	public static int minDepth(TreeNode node) {
		
		if(node==null) return 0;
		
		int left = minDepth(node.left);
		int right = minDepth(node.right);
		
		int min = Math.min(left, right);
		
		
		  if(left==0) return 1+right; 
		  if(right==0) return 1+left;
		 
		
		return 1+Math.min(left, right);
		
	}
}
