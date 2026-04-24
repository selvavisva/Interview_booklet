package binarytree;

public class PathSumEqTarget {
	
	public static void main(String[] args) {
		TreeNode root = new TreeNode(3);
		root.left = new TreeNode(9);
		root.right = new TreeNode(20);
		root.right.left = new TreeNode(85);
		root.right.right = new TreeNode(7);
		System.out.println(hasPathSum(root,30));
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
	
	public static boolean hasPathSum(TreeNode node, int target) {		
		//if(node==null) return false;
		if(node.left==null && node.right==null) {
			return target==node.val;
		}
		int remaining = target-node.val;		
		return hasPathSum(node.left, remaining) || hasPathSum(node.right,remaining);		
	}
}
