package binarysearch;

public class InsertIntoBST {
	public static void main(String[] args) {

		TreeNode root = new TreeNode(50);
		TreeNode n1 = new TreeNode(30);
		TreeNode n2 = new TreeNode(60);
		TreeNode n3 = new TreeNode(20);
		TreeNode n4 = new TreeNode(40);
		TreeNode n5 = new TreeNode(10);
		
		root.left=n1;
		root.right=n2;
		n1.left=n3;
		n1.right=n4;
		n3.left=n5;
		
		insertToBST(root, 38);
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
	
	private static TreeNode insertToBST(TreeNode node, int val) {
		
		if(node==null) return new TreeNode(val);
		
		if(val < node.val) {
			node.left = insertToBST(node.left,val);
			
		}else {
			
			node.right = insertToBST(node.right,val);
		}
		
		return node;
	}

}
