package binarytree;

public class InvertBinaryTree {
	public static void main(String[] args) {
		TreeNode root = new TreeNode(10);
		root.left = new TreeNode(9);
		root.left.left = new TreeNode(189);
		root.left.right = new TreeNode(100);
		root.right = new TreeNode(20);
		root.right.left = new TreeNode(15);
		root.right.right = new TreeNode(7);
		
		System.out.println(invertTree(root));
		
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
	
	public static TreeNode invertTree(TreeNode node) {		
		if(node==null) return null;
		
		TreeNode temp=node.left;
		node.left=node.right;
		node.right=temp;
		
		invertTree(node.left);
		invertTree(node.right);
		
		return node;
		
	}
}
